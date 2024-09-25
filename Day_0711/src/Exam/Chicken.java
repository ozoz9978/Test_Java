package Exam;

public abstract class Chicken {
	
		private String taste;
		
		
		public Chicken() {
			super();
		}

		
		public Chicken(String taste) {
			super();
			this.taste = taste;
		}

		
		public String getTaste() {
			return taste;
		}


		public void setTaste(String taste) {
			this.taste = taste;
		}


		public void output() {
			System.out.println("치킨의 종류: "+taste);
		}
		// 어차피 하위클래스에서 오버라이드 할 예정이면 메소드의 몸통이 없는 매소드로 만듬 => 추상메소드
		public abstract void cook() ;
			
		
			
		
		

	}
