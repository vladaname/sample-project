package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the korpa database table.
 * 
 */
@Entity
@NamedQuery(name="Korpa.findAll", query="SELECT k FROM Korpa k")
public class Korpa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idkorpa;

	private int kolicina;

	//bi-directional many-to-one association to Korisnik
	@ManyToOne
	private Korisnik korisnik;

	//bi-directional many-to-one association to Pica
	@ManyToOne
	private Pica pica;

	public Korpa() {
	}

	public int getIdkorpa() {
		return this.idkorpa;
	}

	public void setIdkorpa(int idkorpa) {
		this.idkorpa = idkorpa;
	}

	public int getKolicina() {
		return this.kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	public Korisnik getKorisnik() {
		return this.korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public Pica getPica() {
		return this.pica;
	}

	public void setPica(Pica pica) {
		this.pica = pica;
	}

	@Override
	public String toString() {
		return "Korpa [idkorpa=" + idkorpa + ", kolicina=" + kolicina + "]";
	}

	

	

	
}