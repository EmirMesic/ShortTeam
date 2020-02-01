package parking;

public class Kasa {
    private int brojKovanica;
    private double vrijednostKovanica;

    private Map<vrijednostKovanica, brojKovanica> kovanice = new HashMap<>();

    public Kasa(){

    }

    public Kasa (int brojKovanica, double vrijednostKovanica){
        this.brojKovanica = brojKovanica;
        this.vrijednostKovanica = vrijednostKovanica;
    }

    public int getBrojKovanica() {
        return brojKovanica;
    }

    public void setBrojKovanica(int brojKovanica) {
        this.brojKovanica = brojKovanica;
    }

    public double getVrijednostKovanica() {
        return vrijednostKovanica;
    }

    public void setVrijednostKovanica(double vrijednostKovanica) {
        this.vrijednostKovanica = vrijednostKovanica;
    }

    public double getSumaKovanica() {
        return sumaKovanica;
    }

    public static double getSumaKovanica() {
        double sumaKovanica1 = 0;  //suma svih kovanica od 1KM
        double sumaKovanica2 = 0;  //suma svih kovanica od 2KM
        double sumaKovanica05 = 0; //suma svih kovanica od 0.5KM

        for (vrijednostKovanica vrijednost : kovanice){
            if (vrijednost == 0.5){
                sumaKovanica05 = vrijednost * brojKovanica;
            }
            if (vrijednost == 1){
                sumaKovanica1 = vrijednost * brojKovanica;
            }
            if (vrijednost == 2){
                sumaKovanica2 = vrijednost * brojKovanica;
            }
        }
        return sumaKovanica05 + sumaKovanica1 + sumaKovanica2;
    }

}