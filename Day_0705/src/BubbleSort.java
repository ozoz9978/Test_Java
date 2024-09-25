import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int temp;
        int[] data = new int[10];
       // int cnt = 0;
        
        // 1~100 까지의 초기값
        for (int i = 0; i < data.length; ++i) {
            data[i] = (int) (Math.random() * 100 + 1);
        }

        // 초기
        System.out.println("처음정렬:");
        for (int value : data) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 내림차순 정렬
//        cnt =0 ;
        for (int i = 0; i < data.length - 1; ++i) {
            for (int j = 0; j < data.length - 1 - i; ++j) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    //cnt ++; 반복횟수를 줄여 계산횟수를 줄이고싶을때
                }
            }
//            if(cnt==0 )break;
        }

        // 정렬 후 
        System.out.println("정렬 후:");
        for (int value : data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}