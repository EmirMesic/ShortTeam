package parking;

public class DnevnaKarta extends Karta{

	private double cijenaDana;
	
	private static double dan = 24;
	
	public DnevnaKarta() {
		super(dan);		
	}

	public DnevnaKarta(double cijena) {
		super(dan);		
	}
	
	public double cijenaDan(double cijenaDana) {
		cijenaDana = this.getCijenaSat()*24;
		return cijenaDana;
	}
	
	public double getCijenaDana() {
		return cijenaDana;
	}
	
	@Override
	public String toString() {
		return "DnevnaKarta karta: " + getIdKarta() + ", cijena: " + this.getCijenaDana() + ", vrijeme: "
				+ dan + "h" ;
	}

}
