
public class ArrayTest_01 {

	   public static void main(String[] args) {
	      // 정수 배열 생성
//	      int [] iary = new int[10]; // 전부 같은 데.타입만 가능
	      
	      //일일히 넣기
//	      iary[0] = 15;
//	      iary[1] = 5;
//	      iary[2] = 7;
	      
	      //초기화(초기에 set) 시키며 생성
//	      int [] iary = new int [ ] {15, 5, 6, 0,0,0,0,0,}
	      
	      //..의 축약형 (new int []를 생략해도 정상작동)
//	      int [] iary = { 15, 5, 7, 0,0,0,0,0,0,0 }; 
	         //{} 내 개수만큼 생성, 10개 만들고 싶으면 일일히 다 적어넣어야 함
	      
	      
	      
//	      System.out.println(iary[0]);      
//	      System.out.println(iary.length);
	      
//	      for(int idx = 0; idx < iary.length ; ++idx )
//	         System.out.println(iary[idx]);
	      
	      //-------------------------------
	      
	      int [] iary = new int[10];

	      // 데이터를 발생시켜 초기화 (0~99; *100) (0~100; *101)
	      for(int idx = 0; idx < iary.length ; ++idx )
	         iary[idx] = (int)(Math.random()*100 + 1); //0이상 1미만사이의 난수를 발생시키는 double형(캐스트 필요)
	      
	      for(int idx = 0; idx < iary.length ; ++idx )
	         System.out.println(iary[idx]);


	   }

	}
