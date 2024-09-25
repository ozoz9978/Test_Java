package dateapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest_02 {

	public static void main(String[] args) {
		LocalDateTime localDateTime1 = LocalDateTime.of(2024, 1,15,10,0,0);
		
		String format1 = localDateTime1.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));
		String format2 = localDateTime1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS"));
		
		System.out.println("localDateTime =" +localDateTime1);
		System.out.println("Format1= "+format1);
		System.out.println("Format2= "+format2);
		
		//DateTimeFormat에 등록된 iso 8601 날짜 포멧 사용
		String format3 = localDateTime1.format(DateTimeFormatter.ISO_LOCAL_DATE);
		
		System.out.println("localDateTime=" +localDateTime1);
		System.out.println("Format3= " +format3);
		
		
		
	}

}
