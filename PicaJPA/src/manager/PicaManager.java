package manager;

import java.util.List;

import javax.persistence.EntityManager;

import model.Pica;

public class PicaManager {

	public static List<Pica> findAllPica() {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			return em.createQuery("SELECT p FROM Pica p").getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public static boolean updatePica(int idpica, int cena) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			Pica p = em.find(Pica.class, idpica);
			p.setCena(cena);
			em.persist(p);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		finally {
			em.close();
		}
	}

	

	public static Pica findByName(String nazivPice) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			return (Pica) em.createQuery("SELECT p FROM Pica p WHERE p.nazivPice =:nazivPice")
					.setParameter("nazivPice", nazivPice).getSingleResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public static boolean createPica(int cena, String nazivPice, int velicina) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			Pica p = new Pica();
			p.setCena(cena);
			p.setNazivPice(nazivPice);
			p.setVelicina(velicina);
			p.setObrisan(0);
			em.persist(p);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		} finally {
			em.close();
		}
	}

	public static boolean deletePica(int idPica) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			Pica p = em.find(Pica.class, idPica);
			if (p != null) {
				p.setObrisan(1);
				em.persist(p);
				em.getTransaction().commit();
				return true;
			}
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		} finally {
			em.close();
		}
	}

	public static void main(String[] argd) {
		boolean kreiraj = createPica(200, " margarita", 30);
	}

}
