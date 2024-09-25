
/* [문제]  성별, 키(cm) 와 몸무게(kg)을 키보드로 입력받아 표준체중을 구하고 bmi를 구하시오!
 *         남성 표준체중 = 키(m) x 키(m) x 22
 *         여성 표준체중 = 키(m) x 키(m) x 21
 * 
 *         몸무게(kg)을 지정한 후 BMI를 구하시오!
 *         BMI = 몸무게(kg) / 키(m)의 제곱
 */

import java.util.Scanner;

public class Exam_16 {
	
   public static void main(String[] args) {
	  Scanner keyin = new Scanner(System.in); // import 해야함
      // 변수를 선언하고 값을 지정
      double height, weight, bmi, result;
      double stdWeight = 0;
      String gender;
      String bmi_result; 
      
      System.out.print("성별 입력(남/여): ");
      gender = keyin.next();
      
      System.out.print("키 입력(cm): ");
      height = keyin.nextDouble();
      
      System.out.print("몸무게 입력(kg): ");
      weight = keyin.nextDouble();
      
      double temp = height / 100; // m로 환산된 키
 
      //남자인지 여자인지 판단해서 표준체중을 다르게 계산해야 함
      
//      if(gender.equals("남")) { // 기본자료형만 ==을 비교, 객체참조형은 equals만 가지고 해야함
//    	  stdWeight = temp * temp * 22;
//      } else {
//    	  stdWeight = temp * temp * 21;
//      }
      result = switch( gender ) {
      	case "남" ->  stdWeight = temp * temp * 22;
		case "여" ->  stdWeight = temp * temp * 21;
		default -> 0.0;
      	};
      bmi = weight / (temp * temp);
      
      if (bmi >= 35) {
    	  bmi_result = "고도비만";
		}else if (bmi >=30){
			bmi_result = "중도비만";
		}else if (bmi >=25){
			bmi_result = "경도비만";
		}else if (bmi >=23){
			bmi_result = "과체중";
		}else if (bmi >=18.5){
			bmi_result = "정상";
		}else {
			bmi_result = "저체중";
		}
 
      // 출력
      System.out.printf("키가 %.2fcm의 표준체중은 %.2f입니다.", height, stdWeight);
      System.out.printf("BMI는 %.2f이고 결과는 %s입니다",bmi,bmi_result);
      keyin.close();
   }
}

