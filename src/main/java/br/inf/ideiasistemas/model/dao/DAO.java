package br.inf.ideiasistemas.model.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class DAO <T>{
    private final Class<T> classe;

    public DAO(Class<T> classe) {
        this.classe = classe;
    }

    public void adiciona(T t) {

        // consegue a entity manager
        EntityManager em = new JPAUtil().getEntityManager();

        // abre transacao
        em.getTransaction().begin();

        try {
            // persiste o objeto
            em.persist(t);
            em.getTransaction().commit();
            em.refresh(t);

        } catch (Exception e) {
            em.getTransaction().rollback();
            em.clear();
            em.close();
            throw e;
        }

        em.clear();
        em.close();
    }

    public void atualiza(T t) {
        EntityManager em = new JPAUtil().getEntityManager();
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ideia");
//        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.getEntityManagerFactory().getCache().evictAll();
        try {
            em.merge(t);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            em.clear();
            em.close();
//            emf.close();
            throw e;
        }
        em.clear();
        em.close();
//        emf.close();
    }

    public T HQlQuery(String sql) {
        List<T> list = null;
        EntityManager em = new JPAUtil().getEntityManager();
        em.clear();
        try {

            Query query = em.createQuery(sql);
            query.setMaxResults(1);

            List resultList = query.getResultList();
            list = resultList;

        } catch (Exception e) {

            em.clear();
            em.close();
            return null;
        }
        em.clear();
        em.close();
        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }

    public List<T> nativeSql(String sql) {
        List<T> resultList = null;
        EntityManager em = new JPAUtil().getEntityManager();
        em.clear();

        Query query = em.createNativeQuery(sql);

        try {
            resultList = query.getResultList();
        } catch (Exception e) {

            em.clear();
            em.close();
            return null;
        }
        em.clear();
        em.close();
        return resultList;
    }



}
