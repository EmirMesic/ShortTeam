package parking;

import java.util.ArrayList;

public abstract class Karta {
	
	public int idKarta;
	
	ArrayList<Kovanica> listKovanice = new ArrayList<>();
	
	abstract void addKovanica(Kovanica kov);
	
	abstract ArrayList<Kovanica> getKOvanice();
	
	/* ID broj karte */
	abstract int getIdKarta();

	/* Postavljanje cijene */
	abstract void setCijena(double cijena);
	
	abstract double getCijena();
	
	/* Postavljanje i vracanje vremena */
	abstract double getVrijeme();

}
