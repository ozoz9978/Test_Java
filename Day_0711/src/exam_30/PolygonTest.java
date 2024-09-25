package exam_30;
import java.util.Scanner;

public class PolygonTest {
	public static void main(String[] args) {
        Point[] polygon = new Point[50];
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String choice;
        while(true) {
        	System.out.print("\n1.원  2.사각형 3.전체출력 0.종료");
        	System.out.print("\n메뉴를 선택해 주세요:");
        	choice = scanner.next();
        
            switch (choice) {
            case "1":{
                System.out.println("x => ");
                int x = scanner.nextInt();
                System.out.println("y => ");
                int y = scanner.nextInt();
                System.out.println("radius => ");
                double radius = scanner.nextDouble();
                polygon[count++] = new Circle(x, y, radius);
                System.out.println();
                break;
                }
            case "2":{
            	System.out.println("x => ");
                int x = scanner.nextInt();
                System.out.println("y => ");
                int y = scanner.nextInt();
                System.out.println("width => ");
                int width = scanner.nextInt();
                System.out.println("height => ");
                int height = scanner.nextInt();
                polygon[count++] = new Rectangle(x,y,width, height);
                System.out.println();
                break;
                }

            case "3":{
                for (int i = 0; i<count;++i) {
                	polygon[i].print();
                	System.out.println();
                }
                break;}
            case "0":{
                System.out.println("## 프로그램을 종료합니다.");
                System.exit(0);
                }
            default:
                System.out.println("메뉴를 선택해주세요.");
        }
       
    	}	
	}
}