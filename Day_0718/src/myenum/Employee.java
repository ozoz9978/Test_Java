package myenum;

public enum Employee {
	이몽룡("부장"){
		public String work() {
			return "제품에 대한 RND";
		}
	}, 성춘향("과장"){
		public String work() {
			return "판매할 제품의 검수";
		}
	}
	, 김방자("대리")
	, 박향단("사원")
	, 변사또("이사"){
		public String work() {
			return "업무 총괄 담당";
		}
	},
	;
	public String title;
	Employee(String title){
		this.title = title;
		
	}
	public String work(){
		return "완성 제품을 대리점에 판매";
	}
	

}
