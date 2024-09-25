	/*
	 * [문제 -08 ] 
	 *  마트에서 물건을 구매하였다. 물건 총 금액을 입력받고 현금으로 지불할 금액도 입력받는다.
	 *  거스름돈을 구하시오.
	 *  지불할금액이 총금액보다 작으면 얼마나 부족한지 출력
	 */ 
	import java.util.Scanner;

	public class Exam_08 {

		public static void main(String[] args) {
			Scanner keyin = new Scanner(System.in); // import 해야함
			
			int price, money, charge;
			
			System.out.print("물건의 총 가격을 입력해주세요: ");
			price = keyin.nextInt();
			
			System.out.print("현금으로 지불할 금액을 입력해주세요: ");
			money = keyin.nextInt();
			
			charge = money - price;
			
			if (charge == 0) {
				System.out.println("결제 완료");
			}else if (charge < 0){
				System.out.println((charge*-1) + "원이 부족");
			}else {
				System.out.println(charge+ "원 거스름돈이 생김");
			}
		}

	}
