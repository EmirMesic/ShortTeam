package parking;

import java.util.ArrayList;

public class SatnaKarta extends Karta{
	
	private static int numObj;
	private double cijena;
	private double vrijeme;
	
	public SatnaKarta() {
		numObj++;
		this.idKarta = numObj;
		this.vrijeme = 1;		
	}
	
	public int getIdKarta() {
		return idKarta;
	}

	/* Cijena sata */
	public void cijenaSat(double novaCijenaSat) {
		this.cijena = novaCijenaSat;
	}

	public double getCijenaSat() {
		return this.cijena * vrijeme;
	}

	/* Postavljanje cijene */

	public void setCijena(double cijena) {
		this.cijena = vrijeme * cijena;
	}
	
	@Override
	double getCijena() {
		return this.cijena;
	}
	
	public double getVrijeme() {
		return vrijeme ;
	}

	public void setVrijeme(double vrijeme) {
		this.vrijeme = vrijeme;
	}

	@Override
	public String toString() {
		return "SatnaKarta id: " + idKarta + ", cijena: " + cijena + ", vrijeme: " + vrijeme ;
	}

	@Override
	void addKovanica(int broj, Kovanica kov) {
		super.suma += broj;
		super.listKovanice.add(kov);
		
	}

	@Override
	ArrayList<Kovanica> getKovanice() {
		return super.listKovanice;
	}
	
	@Override
	int getBrojKovanica() {
		return super.suma;
	}

}
