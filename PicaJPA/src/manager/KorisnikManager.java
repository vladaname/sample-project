package manager;

import java.util.List;

import javax.persistence.EntityManager;

import org.jasypt.util.password.StrongPasswordEncryptor;

import model.Korisnik;
import model.Uloga;

public class KorisnikManager {

	public static List<Korisnik> findAll() {
		EntityManager em = JPAUtil.getEntityManager();
		return em.createQuery("SELECT k FROM Korisnik k").getResultList();
	}
	
	public static Korisnik findbyemail(String email) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			return (Korisnik) em.createQuery("SELECT k FROM Korisnik k WHERE k.email =:email")
					.setParameter("email", email).getSingleResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static Korisnik findByTel(String tel) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			return (Korisnik) em.createQuery("SELECT k FROM Korisnik k WHERE k.tel =:tel")
					.setParameter("tel", tel).getSingleResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static boolean createKorisnk(String email, String ime, String prezime, String tel, String username,
			String pass, String adresa) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
			Korisnik k = new Korisnik();
			if (k != null) {
				k.setAdresa(adresa);
				k.setEmail(email);
				k.setIme(ime);
				k.setPrezime(prezime);
				k.setTel(tel);
				k.setUsername(username);
//				k.getUloga().setIduloga(1); NE MOZE
//				Uloga g = em.find(Uloga.class, 1);
				Uloga g = (Uloga) em.createQuery("SELECT u FROM Uloga u WHERE u.iduloga = 1 ").getSingleResult();
				k.setUloga(g);
//				String encyriptedpassword = passwordEncryptor.encryptPassword(pass);
//				k.setPass(encyriptedpassword);
				k.setPass(passwordEncryptor.encryptPassword(pass));
				em.persist(k);
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
//  pojasniti jos jednom celu putanju logovoanja sta se tacno desava u linijama 82 i 83 pronadji mi username za 
//	vrdenoost prosledjenog parametra?
	public static Korisnik login(String username, String pass) {
		EntityManager em = JPAUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			Korisnik k = (model.Korisnik) em.createQuery("FROM Korisnik k WHERE k.username =:username")
					.setParameter("username", username).getSingleResult();
			StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
			String encryptedPass = k.getPass();
			if (pass.equals(k.getPass()) || passwordEncryptor.checkPassword(pass, encryptedPass)) {
				return k;
			}
			else {
			return null;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public static void main(String[] args) {
		List<Korisnik> listaAll = findAll();
		System.out.println(listaAll.toString());
	}

}
