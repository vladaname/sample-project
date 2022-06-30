package manager;

import java.util.List;

import javax.persistence.EntityManager;

public class StatistikaManager {

	public List<Object[]> statistikaProdaje(){
		EntityManager em = JPAUtil.getEntityManager();
		try {
			List<Object[]> podaci = em.createNativeQuery("select sum(s.kolicina) as kolicina, p.nazivPice as naziv "
					+ "from stavka s " + 
					"inner join pica as p on s.pica_idpica = p.idpica " + 
					"group by naziv order by kolicina desc limit 10 ").getResultList();
			
			return podaci;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
		
	}
	public List<Object[]> statistikaProdajeBezLimita(){
		EntityManager em = JPAUtil.getEntityManager();
		try {
			List<Object[]> podaci = em.createNativeQuery("select sum(s.kolicina) as kolicina, p.nazivPice as naziv "
					+ "from stavka s " + 
					"inner join pica as p on s.pica_idpica = p.idpica " + 
					"group by naziv ").getResultList();
			
			return podaci;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
		
	}
	public List<Object[]> statistikaZarade(){
		EntityManager em = JPAUtil.getEntityManager();
		try {
			List<Object[]> listaZarade = em.createNativeQuery("select sum(r.ukupanRacun) as sumaRacun,"
					+ " p.nazivPice as naziv from stavka s " + 
					"inner join pica as p on s.pica_idpica = p.idpica " + 
					"inner join racun as r on s.racun_idracun = r.idracun " + 
					"group by naziv order by kolicina asc limit 10 ").getResultList();
			return listaZarade;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Object[]> statistikaZaradePoDanu(int brojDana){
		EntityManager em = JPAUtil.getEntityManager();
		try {
			List<Object[]> listaZaradePoDanu = em.createNativeQuery("select sum(s.kolicina) as suma, p.nazivPice as naziv from stavka s " + 
					"inner join racun r on s.racun_idracun = r.idracun " + 
					"inner join pica p on s.pica_idpica = p.idpica " + 
					"where r.vremeRacuna > (NOW() - INTERVAL :brojDana DAY) " + 
					"group by naziv order by suma desc limit 10;").setParameter("brojDana", brojDana).getResultList();
			return listaZaradePoDanu;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
			
		}
	}
	
	public static void main(String[] args) {
		
	}
	
}
