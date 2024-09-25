package mathapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//홍길동 100 95 85 xxx...
		// api String - split(),format() /  Integer - parseInt()
		// List- get(), add( )
		// 최종 출력 : forEach
		


public class Exam_33 {
    // Array list에 저장된 데이터를 이용해 합계 , 평균 저장하는 프로그램
    public static void main(String[] args) {
        List<String> source = Arrays.asList("홍길동 100 95 85", "임꺽정 85 77 68", "전우치 85 65 74", "숀요굥 100 99 87", "사오정 74 58 99");
        List<String> target = new ArrayList<>();
        
        for (int i = 0; i < source.size(); ++i) {
            String[] split = source.get(i).split(" ");
            String name = split[0];
            int sum = 0;
            double avg = 0;

            for (int j = 1; j < split.length; ++j) {
                sum += Integer.parseInt(split[j]);
            }
            avg = sum / 3.0;

            target.add(String.format("%s %3s %3s %3s %4d %.2f", name, split[1], split[2], split[3], sum, avg));
        }

        target.forEach((s) -> System.out.println(s));
    }
}