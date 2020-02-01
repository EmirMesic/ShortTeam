package parking;

import java.util.ArrayList;

public abstract class Karta {
	
	public int idKarta;
	
	ArrayList<Kovanica> listKovanice = new ArrayList<>();
	
	int suma;
	
	abstract void addKovanica(int broj, Kovanica kov);
	
	abstract int getBrojKovanica();
	
	abstract ArrayList<Kovanica> getKovanice();
	
	/* ID broj karte */
	abstract int getIdKarta();

	/* Postavljanje cijene */
	abstract void setCijena(double cijena);
	
	abstract double getCijena();
	
	/* Postavljanje i vracanje vremena */
	abstract double getVrijeme();

}
