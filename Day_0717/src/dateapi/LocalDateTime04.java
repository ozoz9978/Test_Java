package dateapi;

import java.time.LocalDateTime;

public class LocalDateTime04 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("현재: "+now);
		System.out.println();
		System.out.println("10년후: "+now.plusYears(10));
		System.out.println("10개월 후: "+now.plusMonths(10));
		System.out.println("10일 후: "+now.plusDays(10));
		System.out.println("10시간 후: "+now.plusHours(10));
		System.out.println("10분후: "+now.plusMinutes(10));
		System.out.println("10초후: "+now.plusSeconds(10));
		
		System.out.println();
		System.out.println("10년전: "+now.minusYears(10));
		System.out.println("10개월 전: "+now.minusMonths(10));
		System.out.println("10일 전: "+now.minusDays(10));
		System.out.println("10시간 잔: "+now.minusHours(10));
		System.out.println("10분전: "+now.minusMinutes(10));
		System.out.println("10초잔: "+now.minusSeconds(10));
		
	}

}
