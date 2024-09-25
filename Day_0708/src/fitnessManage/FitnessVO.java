package fitnessManage;
/* 이름(name), 키(height), 몸무게(Weight), 성별(Gender)
 * 표준체중, bmi, bmi 결과
 */
public class FitnessVO {
		private String name;
		private double weight;
		private double height;
		private String gender;
		//
		public void setName(String name) {
			this.name = name ; // 지역변수
		}
		public void setWei(double weight) {
			this.weight = weight;
		}
		public void setHei(double height) {
			this.height = height;
		}
		public void setGen(String gender) {
			this.gender = gender;	
		}
		//Getter 생성하기

		public String getName() {
			return this.name;	
		}
		public double getWei() {
			return this.weight;
		}
		public double getHei() {
			return this.height;
		}
		public String getGen() {
			return this.gender;
		}
}