package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the racun database table.
 * 
 */
@Entity
@NamedQuery(name="Racun.findAll", query="SELECT r FROM Racun r")
public class Racun implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idracun;

	private String adresaIsporuke;

	private double ukupanRacun;

	@Temporal(TemporalType.TIMESTAMP)
	private Date vremeRacuna;

	//bi-directional many-to-one association to Korisnik
	@ManyToOne
	private Korisnik korisnik;

	//bi-directional many-to-one association to Stavka
	@OneToMany(mappedBy="racun")
	private List<Stavka> stavkas;

	public Racun() {
	}

	public int getIdracun() {
		return this.idracun;
	}

	public void setIdracun(int idracun) {
		this.idracun = idracun;
	}

	public String getAdresaIsporuke() {
		return this.adresaIsporuke;
	}

	public void setAdresaIsporuke(String adresaIsporuke) {
		this.adresaIsporuke = adresaIsporuke;
	}

	public double getUkupanRacun() {
		return this.ukupanRacun;
	}

	public void setUkupanRacun(double ukupanRacun) {
		this.ukupanRacun = ukupanRacun;
	}

	public Date getVremeRacuna() {
		return this.vremeRacuna;
	}

	public void setVremeRacuna(Date vremeRacuna) {
		this.vremeRacuna = vremeRacuna;
	}

	public Korisnik getKorisnik() {
		return this.korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public List<Stavka> getStavkas() {
		return this.stavkas;
	}

	public void setStavkas(List<Stavka> stavkas) {
		this.stavkas = stavkas;
	}

	public Stavka addStavka(Stavka stavka) {
		getStavkas().add(stavka);
		stavka.setRacun(this);

		return stavka;
	}

	public Stavka removeStavka(Stavka stavka) {
		getStavkas().remove(stavka);
		stavka.setRacun(null);

		return stavka;
	}

	@Override
	public String toString() {
		return "Racun [idracun=" + idracun + ", adresaIsporuke=" + adresaIsporuke + ", ukupanRacun=" + ukupanRacun
				+ ", vremeRacuna=" + vremeRacuna + "]";
	}

}