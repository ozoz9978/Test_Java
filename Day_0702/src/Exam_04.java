
/* [문제]  성별, 키(cm) 와 몸무게(kg)을 키보드로 입력받아 표준체중을 구하고 bmi와 비만도를 구하시오!
 *         남성 표준체중 = 키(m) x 키(m) x 22
 *         여성 표준체중 = 키(m) x 키(m) x 21
 * 		   BMI = 몸무게 / 키의 제곱
 *         비만도(%) = 실체중 / 표준체중 * 100 (표준체중 대비 백분율) 
 */
import java.util.Scanner;

public class Exam_04 {
	
   public static void main(String[] args) {
	  Scanner keyin = new Scanner(System.in); // import 해야함
      // 변수를 선언하고 값을 지정
      double height, weight, stdWeight, bmi;
      String gender;
      double fat_ratio;
      
      System.out.print("성별 입력(남/여): ");
      gender = keyin.next();
      
      System.out.print("키 입력(cm): ");
      height = keyin.nextDouble();
      
      System.out.print("몸무게 입력(kg): ");
      weight = keyin.nextDouble();
      
      double temp = height / 100; // m로 환산된 키
 
      //남자인지 여자인지 판단해서 표준체중을 다르게 계산해야 함
      if(gender.equals("남")) { // 기본자료형만 ==을 비교, 객체참조형은 equals만 가지고 해야함
    	  stdWeight = temp * temp * 22;
      } else {
    	  stdWeight = temp * temp * 21;
      }
      
      bmi = weight / (temp * temp);
      fat_ratio = weight / (stdWeight * 100);
      
      // 출력
      System.out.printf("키가 %.2fcm의 표준체중은 %.2fkg입니다.%n", height, stdWeight);
      System.out.printf("BMI는 %.2f이고 비만도(%)는 %.2f%%입니다.%n", bmi, fat_ratio);
      keyin.close();
   }
}