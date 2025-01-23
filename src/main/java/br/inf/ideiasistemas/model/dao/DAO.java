package br.inf.ideiasistemas.model.dao;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;


/**
 *
 * @author henrique
 *
 */
public class DAO<T> {

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

    public void remove(T t) {
        EntityManager em = new JPAUtil().getEntityManager();
        em.getEntityManagerFactory().getCache().evictAll();
        em.getTransaction().begin();

        try {
            em.remove(em.merge(t));
            em.getTransaction().commit();

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

    public List<T> listaTodos() {
        EntityManager em = new JPAUtil().getEntityManager();
        em.clear();

        CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
        query.select(query.from(classe));
        try {
            List<T> lista = em.createQuery(query).getResultList();

            em.clear();
            em.close();
            return lista;
        } catch (Exception e) {
            em.clear();
            em.close();
            return null;
        }
    }

    public T buscaPorId(Integer id) {
        EntityManager em = new JPAUtil().getEntityManager();
        try {
            em.clear();
            T instancia;
            instancia = em.find(classe, id);
            em.clear();
//
            em.close();
            return instancia;
        } catch (Exception e) {
            em.clear();
            em.close();
            return null;
        }

    }

    public List<T> listaTodosPaginada(int firstResult, int maxResults) {
        EntityManager em = new JPAUtil().getEntityManager();
        em.clear();

        try {
            CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
            query.select(query.from(classe));

            List<T> lista = em.createQuery(query).setFirstResult(firstResult)
                    .setMaxResults(maxResults).getResultList();
            em.clear();
            em.close();
            return lista;
        } catch (Exception e) {
            em.clear();
            em.close();
            return null;
        }
    }

    public int countAll() {
        EntityManager em = new JPAUtil().getEntityManager();
        em.clear();
        try {
            long result = (Long) em.createQuery(
                            "select count(n) from " + classe.getName() + " n")
                    .getSingleResult();
            em.clear();
            em.close();
            return (int) result;
        } catch (Exception e) {
            em.clear();
            em.close();
            return 0;
        }
    }

    public List<T> SQlQuery(String sql) {
        EntityManager em = new JPAUtil().getEntityManager();
        em.clear();

        List<T> lista = null;

        try {
            lista = (List<T>) em.createNativeQuery(sql).getResultList();

        } catch (Exception e) {

            em.clear();
            em.close();

        }

        em.clear();
        em.close();
        return lista;
    }

    public List<T> HQlQuery(String sql, int MaxResults) {
        List<T> list = null;
        EntityManager em = new JPAUtil().getEntityManager();
        em.clear();

        Query query = em.createQuery(sql);
        query.setMaxResults(MaxResults);
        try {

            List resultList = query.getResultList();
            list = resultList;

        } catch (Exception e) {

            em.clear();
            em.close();
            return null;
        }
        em.clear();
        em.close();
        return list;
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
