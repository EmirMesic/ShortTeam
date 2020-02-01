package parking;

public class DnevnaKarta extends Karta{

	private static double dan = 24;
	
	public DnevnaKarta(int idKarta, double cijena) {
		super(idKarta, dan);
		
	}

	public double cijenaDana() {
		return this.getCijenaSat()*24;
	}
	
	@Override
	public String toString() {
		return "DnevnaKarta karta: " + getIdKarta() + ", cijena: " + this.cijenaDana() + ", vrijeme: "
				+ dan + "h" ;
	}

}
