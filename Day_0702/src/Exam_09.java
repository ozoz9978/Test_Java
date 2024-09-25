/*
 * [문제-8] 1년은 365.2422일이다. 이것을 일, 시, 분, 초로 나눠서 출력하시오.
 * day, hour, minute, second, temp
 * [실행결과 ] 1년은 365.2422일이고 이것은 365일 5시간 48분 46.08초 입니다.
 */
public class Exam_09 {

	public static void main(String[] args) {
		double year = 365.2422;
		int day = (int)year;
		double hour, minute, second, temp;
		System.out.println(day);
		
		temp = year % 365.0 * 24.0;
		hour = (int)temp;
		System.out.println(hour);
		
		minute = (temp-hour)*60;
		System.out.println((int)minute);
		
		System.out.printf("1년은 "+ year +"일이고 이것은 "+day+"일 "+hour+"시간 "+(int)minute+"분 입니다.");
		
		
	}

}
