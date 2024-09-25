package dateapi;

import java.time.LocalDateTime;

public class LocalDateTime03 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Year => "+now.getYear());
		System.out.println("Month => "+now.getMonth());
		System.out.println("DayOfMonth => "+now.getDayOfMonth());
		System.out.println("DayOfWeek => "+now.getDayOfWeek());
		System.out.println("DayOfYear => "+now.getDayOfYear());
	}

}
