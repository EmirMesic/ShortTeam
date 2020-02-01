package parking;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Print {
	
	
	public void parkingTicket() {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println("Current Date Time : " + dateFormat.format(cal.getTime()));
		
		cal.add(Calendar.HOUR, +1);
		System.out.println("Current Date Time : " + dateFormat.format(cal.getTime()));
	}
	
	
	public void allTicket() {}

}
