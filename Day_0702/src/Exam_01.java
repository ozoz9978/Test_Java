
/*
 * [문제] 키(Height)를 지정한 후 표준체중을 구하시오!
 *         남성 표준체중 = 키(m) x 키(m) x 22
 *         여성 표준체중 = 키(m) x 키(m) x 21
 */
public class Exam_01 {
   public static void main(String[] args) {
      // 변수를 선언하고 값을 지정
      double height = 164;
      double stdWeight;
      
      double temp = height / 100;
      
      // 처리
      stdWeight = temp * temp * 21;
      
      // 출력
      System.out.printf("키가 %.2fcm의 표준체중은 %.2fkg입니다.", height, stdWeight);
   }
}