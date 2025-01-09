package br.inf.ideiasistemas.model.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.FlushModeType;
import jakarta.persistence.Persistence;

public class JPAUtil {
    private static EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("ideia");

    public EntityManager getEntityManager() {
        EntityManager em = emf.createEntityManager();
        em.clear();
        em.getEntityManagerFactory().getCache().evictAll();
        em.setFlushMode(FlushModeType.COMMIT);

//        emf.close();
        return em;
    }

    public void close(EntityManager em) {
        em.flush();
        em.clear();
        em.close();
        emf.close();
    }
}
