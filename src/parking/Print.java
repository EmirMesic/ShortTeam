package parking;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Print {

	Kasa kasa = new Kasa();
	
	ArrayList<Karta> karta= new ArrayList<Karta>();

	public void parkingTicket() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();

		System.out.println("Vrijeme izdavanje karte :" + dateFormat.format(cal.getTime()));

		double broj = kasa.getSumaKovanica();

		int i = (int) broj;

		if (broj % 1 == 0.5) {
			cal.add(Calendar.MINUTE, +30);
		}

		cal.add(Calendar.HOUR, +i);

		System.out.println(" Date Time : " + dateFormat.format(cal.getTime()));
	}

	public void allTicket() {
		System.out.println("Broj izdatih karti: " + karta.size());
		
		for (int i = 0; i < karta.size(); i++) {
			System.out.println(karta.get(i));
		}
	}

}
