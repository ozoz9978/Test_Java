import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int temp;
        int[] data = new int[10];
        
        // 1~100까지의 초기값
        for (int i = 0; i < data.length; ++i) {
            data[i] = (int) (Math.random() * 100 + 1);
        }

        // 처음 정렬
        System.out.println("처음 정렬 :");
        for (int value : data) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 내림차순 정렬실행
        for (int i = 0; i < data.length - 1; ++i) {
            int maxIndex = i;
            for (int j = i + 1; j < data.length; ++j) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }
            // 최대값을 첫번째 요소와 바꾼다
            temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;
        }

        // 정렬 후
        System.out.println("정렬 후 :");
        for (int value : data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}