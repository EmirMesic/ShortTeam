package parking;

public class Kovanica {

    private double vrijednostKovanice;

    public Kovanica() {
    }

    public Kovanica(double vrijednostKovanice) {
        this.vrijednostKovanice = vrijednostKovanice;
    }

    public double getVrijednostKovanice() {
        return vrijednostKovanice;
    }

    public void setVrijednostKovanice(double vrijednostKovanice) {
        this.vrijednostKovanice = vrijednostKovanice;
    }

    //mehanizam za provjeru validnosti unosenja kovanica
    public static boolean unosenjeKovanica(int brojKovanica, double vrijednostKovanica) {

        if (vrijednostKovanica != 0.5 && vrijednostKovanica != 1 && vrijednostKovanica != 2) {
            System.out.println("Greska. Unesite ponovo");
            return false;
        }
        return true;
    }

}
