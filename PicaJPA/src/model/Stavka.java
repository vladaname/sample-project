package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stavka database table.
 * 
 */
@Entity
@NamedQuery(name="Stavka.findAll", query="SELECT s FROM Stavka s")
public class Stavka implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idstavka;

	private int kolicina;

	//bi-directional many-to-one association to Pica
	@ManyToOne
	private Pica pica;

	//bi-directional many-to-one association to Racun
	@ManyToOne
	private Racun racun;

	public Stavka() {
	}

	public int getIdstavka() {
		return this.idstavka;
	}

	public void setIdstavka(int idstavka) {
		this.idstavka = idstavka;
	}

	public int getKolicina() {
		return this.kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	public Pica getPica() {
		return this.pica;
	}

	public void setPica(Pica pica) {
		this.pica = pica;
	}

	public Racun getRacun() {
		return this.racun;
	}

	public void setRacun(Racun racun) {
		this.racun = racun;
	}

	@Override
	public String toString() {
		return "Stavka [idstavka=" + idstavka + ", kolicina=" + kolicina + ", pica=" + pica + ", racun=" + racun + "]";
	}

}