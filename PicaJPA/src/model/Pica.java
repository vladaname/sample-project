package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the pica database table.
 * 
 */
@Entity
@NamedQuery(name="Pica.findAll", query="SELECT p FROM Pica p")
public class Pica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idpica;

	private int cena;

	private String nazivPice;

	private int obrisan;

	private int velicina;

	//bi-directional many-to-one association to Korpa
	@OneToMany(mappedBy="pica")
	private List<Korpa> korpas;

	//bi-directional many-to-one association to Stavka
	@OneToMany(mappedBy="pica")
	private List<Stavka> stavkas;

	public Pica() {
	}

	public int getIdpica() {
		return this.idpica;
	}

	public void setIdpica(int idpica) {
		this.idpica = idpica;
	}

	public int getCena() {
		return this.cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String getNazivPice() {
		return this.nazivPice;
	}

	public void setNazivPice(String nazivPice) {
		this.nazivPice = nazivPice;
	}

	public int getObrisan() {
		return this.obrisan;
	}

	public void setObrisan(int obrisan) {
		this.obrisan = obrisan;
	}

	public int getVelicina() {
		return this.velicina;
	}

	public void setVelicina(int velicina) {
		this.velicina = velicina;
	}

	public List<Korpa> getKorpas() {
		return this.korpas;
	}

	public void setKorpas(List<Korpa> korpas) {
		this.korpas = korpas;
	}

	public Korpa addKorpa(Korpa korpa) {
		getKorpas().add(korpa);
		korpa.setPica(this);

		return korpa;
	}

	public Korpa removeKorpa(Korpa korpa) {
		getKorpas().remove(korpa);
		korpa.setPica(null);

		return korpa;
	}

	public List<Stavka> getStavkas() {
		return this.stavkas;
	}

	public void setStavkas(List<Stavka> stavkas) {
		this.stavkas = stavkas;
	}

	public Stavka addStavka(Stavka stavka) {
		getStavkas().add(stavka);
		stavka.setPica(this);

		return stavka;
	}

	public Stavka removeStavka(Stavka stavka) {
		getStavkas().remove(stavka);
		stavka.setPica(null);

		return stavka;
	}

	@Override
	public String toString() {
		return "Pica [idpica=" + idpica + ", cena=" + cena + ", nazivPice=" + nazivPice + ", velicina=" + velicina
				+ "]";
	}

}