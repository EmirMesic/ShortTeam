package parking;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class parkingMain {
	public static void main(String[] args) {
		
		Karta karta = new Karta();
		Print print = new Print();
		DnevnaKarta dnevnaKarta = new DnevnaKarta();
		
		
		Scanner input = new Scanner(System.in);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Vrijeme: " + dateFormat.format(date));
		System.out.println("------------------------------------------");
		System.out.println("1. Postavite cijenu jednog sata parkinga \n2. Postavite cijenu dnevnog parkinga \n3. Ipis individualne karte \n4. Ispis svih karata");
		System.out.println("------------------------------------------");
		System.out.print("Izaberite opciju: ");
		int choice = input.nextInt();
		
	
		while(choice != 0) {
			
			switch (choice) {
			case 1: 
				System.out.print("Unesite novu cijenu sata parkinga: ");
				double novaCijenaSat = input.nextDouble();
				karta.cijenaSat(novaCijenaSat);
				break;
			case 2:
				double novaCijenaDan = input.nextDouble();
				dnevnaKarta.cijenaDan(novaCijenaDan);			
				break;
			case 3:
				break;
//				print.parkingTicket();
			case 4:
				break;
//				print.allTicket();
			default:
				break;
			}
			System.out.println("Cijena dana: " + dnevnaKarta.getCijenaDana() + dnevnaKarta.getCijenaSat());
			date = new Date();
			System.out.println(" ");
			System.out.println("Vrijeme: " + dateFormat.format(date));
			System.out.println("------------------------------------------");
			System.out.println("1. Postavite cijenu jednog sata parkinga \n2. Postavite cijenu dnevnog parkinga \n3. Ipis individualne karte \n4. Ispis svih karata");
			System.out.println("------------------------------------------");
			System.out.print("Izaberite opciju: ");
			choice = input.nextInt();
		}
	}
}
