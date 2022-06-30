package manager;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Korisnik;
import model.Korpa;
import model.Pica;
import model.Racun;
import model.Stavka;

public class StavkaManager {

	public static List<Stavka> findAllStavka() {
		EntityManager em = JPAUtil.getEntityManager();
		return em.createQuery("SELECT s FROM Stavka s").getResultList();
	}
	
	public static boolean deleteStavka(int idkorisnik) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			Query q = (Query) em.createQuery("SELECT s from Stavka s WHERE s.racun.korisnik.idkorisnik =:idkorisnik")
					.setParameter("idkorisnik", idkorisnik).getResultList();
			em.remove(q);
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
	
	public static List<Stavka> findAllStavkaById(int idkorisnik){
		EntityManager em = JPAUtil.getEntityManager();
		try {
			return em.createQuery("SELECT s from Stavka s WHERE s.racun.korisnik.idkorisnik =:idkorisnik")
					.setParameter("idkorisnik", idkorisnik).getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean kupi1(int idkorisnik, String adresa) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			List<Korpa> list = em.createQuery("SELECT k FROM Korpa k WHERE k.korisnik.idkorisnik =:idkorisnik")
					.setParameter("idkorisnik", idkorisnik).getResultList();
			if(list == null || list.isEmpty()) {
				return false;
			}
			Racun r = new Racun();
			Korisnik k = em.find(Korisnik.class, idkorisnik);
			r.setKorisnik(k);
			r.setVremeRacuna(new Date());
			if(adresa.length() > 0) {
				r.setAdresaIsporuke(adresa);
			}
			else {
				r.setAdresaIsporuke(k.getAdresa());
			}
			int sum = 0;
			for (Korpa korpa : list) {
				sum += korpa.getKolicina() * korpa.getKolicina();
			}
			r.setUkupanRacun(sum);
			em.persist(r);
			em.flush();
			
			for (Korpa korpa : list) {
				Stavka s = new Stavka();
				s.setRacun(r);
				s.setKolicina(korpa.getKolicina());
				s.setPica(korpa.getPica());//setujem ceo objekat Pica?
				em.persist(s);
				em.remove(korpa);
				return true;
				
			}
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
	
	public static int korpaRacun(int idkorisnik) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			List<Korpa> lista = em.createQuery("SELECT k FROM Korpa k WHERE k.korisnik.idkorisnik =:idkorisnik")
					.setParameter("idkorisnik", idkorisnik).getResultList();
			
			int sum = 0;
			
			for (Korpa korpa : lista) {
				sum += korpa.getKolicina() * korpa.getPica().getCena();
			}
			return sum;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
			
		}
		finally {
			em.close();
		}
	}

	public boolean kupi(int idkorisnik, String adresa) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			List<Korpa> lista = em.createQuery("SELECT k FROM Korpa k WHERE k.korisnik.idkorisnik =:idkorisnik")
					.setParameter("idkorisnik", idkorisnik).getResultList();
			if (lista == null || lista.isEmpty()) {
				return false;
			}
			Racun r = new Racun();
			Korisnik k = em.find(Korisnik.class, idkorisnik);
			r.setKorisnik(k);
			r.setVremeRacuna(new Date());
			if (adresa.length() > 0) {
				r.setAdresaIsporuke(adresa);
			}
			else {
				r.setAdresaIsporuke(k.getAdresa());
			}
			int suma = 0;
			for (Korpa korpa : lista) {
				suma += korpa.getPica().getCena() * korpa.getKolicina();
			}
			r.setUkupanRacun(suma);
			em.persist(r);
			em.flush(); // da bi dobili idracun
			for (Korpa korpa : lista) {
				Stavka s = new Stavka();			
				s.setRacun(r);
				s.setPica(korpa.getPica());
				s.setKolicina(korpa.getKolicina());
				em.persist(s);
//				em.remove(korpa);
			}
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
	
	public boolean removeKorpa(int idkorisnik) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			List<Korpa> lista = em.createQuery("SELECT k FROM Korpa k WHERE k.korisnik.idkorisnik =:idkorisnik")
					.setParameter("idkorisnik", idkorisnik).getResultList();
			if (lista == null || lista.isEmpty()) {
				return false;
			}
			for (Korpa korpa : lista) {
				em.remove(korpa);
			}
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
	

//	public static boolean createStavka(int kolicina, int idpica) {
//		EntityManager em = JPAUtil.getEntityManager();
//		try {
//			em.getTransaction().begin();
//			Stavka s = new Stavka();
//			s.setKolicina(kolicina);
//			Pica p = em.find(Pica.class, idpica);
//			if (p != null) {
//				double racunStavke = p.getCena() * s.getKolicina();
//				// Racun r = em.find(Racun.class, 0);
//				// s.setRacun(r);
//				em.persist(s);
//				em.getTransaction().commit();
//				return true;
//			}
//			return false;
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			return false;
//		} finally {
//			em.close();
//		}
//
//	}
	public static void main(String[] args) {
		List<Stavka> lista = findAllStavka();
		for (Stavka stavka : lista) {
			System.out.println(lista.toString());
		}
	}
}
