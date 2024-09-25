package myenum;
public enum Fruit1 {
    사과("Apple"), 
    바나나("Banana"), 
    딸기("Strawberry");

   
	private String data;
	Fruit1(String data) {
        this.data = data;
        System.out.println("과일데이터" + this);
    }
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	

    
}
