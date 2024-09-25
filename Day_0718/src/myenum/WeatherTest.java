package myenum;

public class WeatherTest {

	public static void main(String[] args) {
		Weather[] wap = Weather.values();
		
		for( Weather w: wap) {
			System.out.println(w+"-"+w.title+":"+w.todo()+","+w.play());
		}

	}

}
