package parking;

import java.util.ArrayList;

public class DnevnaKarta extends Karta{

	private static int numObj;
	private double cijena;
	private double vrijeme;	
	
	private static double dan = 24;
	
	public DnevnaKarta() {
		numObj++;
		this.idKarta = numObj * (int)(Math.random()*10);
		this.vrijeme = 24;	
	}
	
	/* ID broj karte */
	public int getIdKarta() {
		return idKarta;
	}
	
	public void cijenaDan(double cijenaDana) {
		this.setCijena(cijenaDana*24);
	}
	
	public double getCijenaDana() {
		return this.getCijena();
	}
	
	@Override
	void setCijena(double cijena) {
		this.cijena = cijena*24;
	}

	@Override
	double getCijena() {
		return this.cijena;
	}

	public double getVrijeme() {
		return vrijeme;
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
	
	@Override
	public String toString() {
		return "Dnevna karta: " + getIdKarta() + ", cijena: " + this.getCijenaDana() + ", vrijeme: "
				+ dan + "h" ;
	}
	
}
