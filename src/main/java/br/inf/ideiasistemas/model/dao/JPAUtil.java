package br.inf.ideiasistemas.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FlushModeType;
import javax.persistence.Persistence;

/**
 *
 * @author henrique
 *
 */
public class JPAUtil {

    private static EntityManagerFactory emf = Persistence
              .createEntityManagerFactory("BAYERIMPORT");

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

//	private static final String PERSISTENCE_UNIT_NAME = "ideia";
//
//	private static ThreadLocal<EntityManager> manager = new ThreadLocal<EntityManager>();
//
//	private static EntityManagerFactory factory;
//
//	JPAUtil() {
//	}
//
//	public static boolean isEntityManagerOpen(){
//		return JPAUtil.manager.get() != null && JPAUtil.manager.get().isOpen();
//	}
//
//	public static EntityManager getEntityManager() {
//		if (JPAUtil.factory == null) {
//			JPAUtil.factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
//		}
//		EntityManager em = JPAUtil.manager.get();
//		if (em == null || !em.isOpen()) {
//			em = JPAUtil.factory.createEntityManager();
//			JPAUtil.manager.set(em);
//		}
//		return em;
//	}
//
//
//
//	public static void closeEntityManager() {
//		EntityManager em = JPAUtil.manager.get();
//		if (em != null) {
//			EntityTransaction tx = em.getTransaction();
//			if (tx.isActive()) {
//				tx.commit();
//			}
//			em.close();
//			JPAUtil.manager.set(null);
//		}
//	}
//
//	public static void close(){
//		closeEntityManager();
//		JPAUtil.factory.close();
//	}
