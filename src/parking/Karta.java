package parking;

import java.util.ArrayList;

public abstract class Karta {
	
	public int idKarta;
	
	ArrayList<Integer> listKovanice = new ArrayList<>();
	
	abstract void addKovanica(Integer kov);
	
	abstract ArrayList<Integer> getKOvanice();
	
	/* ID broj karte */
	abstract int getIdKarta();

	/* Postavljanje cijene */
	abstract void setCijena(double cijena);
	
	abstract double getCijena();
	
	/* Postavljanje i vracanje vremena */
	abstract double getVrijeme();

}
