package parking;

public class Karta {

	private static int numObj;
	
	private int idKarta;
	private double cijena;
	
	private double cijena1h = 1;
	private double cijenaPolaSata = 0.5;
	
	private double vrijeme;
	private double setVrijeme;
	
	public Karta() {
		numObj++;
		this.idKarta = numObj;
		//this.cijena = cijena;
		this.vrijeme = 1;		
	}
	
	public Karta(double vrijeme) {
		numObj++;
		this.idKarta = numObj;
		//this.cijena = cijena;
		this.vrijeme = vrijeme;		
	}
	/* ID broj karte */
	public int getIdKarta() {
		return idKarta;
	}

	public void setIdKarta(int idKarta) {
		this.idKarta = idKarta;
	}
	
	/* Cijena sata */
	
	public void cijenaSat(double novaCijenaSat) {
		this.cijena = novaCijenaSat;
	}

	public double getCijenaSat() {
		return cijena1h*vrijeme;
	}
	
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	
	public double getVrijeme() {
		return vrijeme*setVrijeme;
	}
	
	public void setVrijeme(double vrijeme) {
		this.setVrijeme = vrijeme;
	}

	@Override
	public String toString() {
		return "ID karte : " + idKarta + ", cijena : " + cijena + ", vrijeme : " + vrijeme + " sati";
	}	
	
}
