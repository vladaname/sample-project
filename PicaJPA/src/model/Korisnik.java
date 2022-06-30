package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the korisnik database table.
 * 
 */
@Entity
@NamedQuery(name="Korisnik.findAll", query="SELECT k FROM Korisnik k")
public class Korisnik implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idkorisnik;

	private String adresa;

	private String email;

	private String ime;

	private String pass;

	private String prezime;

	private String tel;

	private String username;

	//bi-directional many-to-one association to Uloga
	@ManyToOne
	private Uloga uloga;

	//bi-directional many-to-one association to Korpa
	@OneToMany(mappedBy="korisnik")
	private List<Korpa> korpas;

	//bi-directional many-to-one association to Racun
	@OneToMany(mappedBy="korisnik")
	private List<Racun> racuns;

	public Korisnik() {
	}

	public int getIdkorisnik() {
		return this.idkorisnik;
	}

	public void setIdkorisnik(int idkorisnik) {
		this.idkorisnik = idkorisnik;
	}

	public String getAdresa() {
		return this.adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPrezime() {
		return this.prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Uloga getUloga() {
		return this.uloga;
	}

	public void setUloga(Uloga uloga) {
		this.uloga = uloga;
	}

	public List<Korpa> getKorpas() {
		return this.korpas;
	}

	public void setKorpas(List<Korpa> korpas) {
		this.korpas = korpas;
	}

	public Korpa addKorpa(Korpa korpa) {
		getKorpas().add(korpa);
		korpa.setKorisnik(this);

		return korpa;
	}

	public Korpa removeKorpa(Korpa korpa) {
		getKorpas().remove(korpa);
		korpa.setKorisnik(null);

		return korpa;
	}

	public List<Racun> getRacuns() {
		return this.racuns;
	}

	public void setRacuns(List<Racun> racuns) {
		this.racuns = racuns;
	}

	public Racun addRacun(Racun racun) {
		getRacuns().add(racun);
		racun.setKorisnik(this);

		return racun;
	}

	public Racun removeRacun(Racun racun) {
		getRacuns().remove(racun);
		racun.setKorisnik(null);

		return racun;
	}

}