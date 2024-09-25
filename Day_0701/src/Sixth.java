/*
 * [문제] 키(cm), 몸무게(kg)를 설정한 후 bmi 체질량지수를 구하여 출력하시오.
 * "당신의 키 174cm, 몸무게 67kg은 bmi xx.xx 입니다"
 * bmi = 몸무게(kg) / 키 (m) 의 제곱
 */

public class Sixth {
	public static void main(String[] args) {
		int height = 174;
		int weight = 67;
		double temp = height/100;
		double bmi = weight / (temp * temp);
		System.out.printf("키 %.0fcm, 몸무게 %.0fkg은 BMI %.2f 입니다.",height,weight,bmi);
	}
}
