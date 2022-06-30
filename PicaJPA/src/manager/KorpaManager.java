package manager;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Korisnik;
import model.Korpa;
import model.Pica;

public class KorpaManager {

	public static List<Korpa> findAllKorpaByKorisnik(int idkorisnik) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			return em.createQuery("SELECT k FROM Korpa k WHERE k.korisnik.idkorisnik =:idkorisnik")
					.setParameter("idkorisnik", idkorisnik).getResultList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static boolean ubaciUKorpu1(int idkorisnik, int idpica) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			em.getTransaction().begin();
	
			Korpa korpa = new Korpa();
			Korisnik k = em.find(Korisnik.class, idkorisnik);
			if (k == null) {
				return false;
			}
			korpa.setKorisnik(k);

			Pica p = em.find(Pica.class, idpica);
			if (p == null) {
				return false;
			}
			korpa.setPica(p);
			em.persist(korpa);

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


	public static boolean ubaciUKorpu(int idkorisnik, int idpica, int kolicina) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			// Query q = em
			// .createQuery("SELECT k FROM Korpa k WHERE k.korisnik.idkorisnik =:idkorisnik
			// " )
			// .setParameter("idkorisnik", idkorisnik);
			// q.setMaxResults(1); //uzima samo jedan
			// List<Korpa> kp = q.getResultList();
			// if (kp == null || kp.isEmpty()) {
			Korpa korpa = new Korpa();
			Korisnik k = em.find(Korisnik.class, idkorisnik);
			if (k == null) {
				return false;
			}
			// else {
			korpa.setKorisnik(k);
			// }

			Pica p = em.find(Pica.class, idpica);
			if (p == null) {
				return false;
			}
			// else {
			korpa.setPica(p);
			korpa.setKolicina(kolicina);
			em.persist(korpa);
			// }

			// }
			// else {
			// Korpa k = kp.get(0);// sta sam ovde uradio?
			// int prethodnaKolicina = k.getKolicina();
			// prethodnaKolicina++;
			// k.setKolicina(prethodnaKolicina);
			// em.persist(k);
			// }
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

	public static boolean deleteStavkaUKorpi(Object idkorpa) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			Korpa k = em.find(Korpa.class, idkorpa);
			em.remove(k);
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

	public static void main(String[] args) {
		// boolean ubaciUKorpu = ubaciUKorpu(1, 1, 1);
		// if (ubaciUKorpu) {
		// System.out.println("U korpi");
		// } else {
		// System.out.println("Nije u korpi");
		// }
		List<Korpa> korpaAllK = findAllKorpaByKorisnik(1);
//			for (Korpa korpa : korpaAllK) {
				System.out.println(korpaAllK.toString());
//			}

	}
}
