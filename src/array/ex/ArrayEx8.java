package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요:");
        int n = scanner.nextInt();

        int [] numbers = new int[n];
        int MinNumber, MaxNumber;

        System.out.println(n + "개의 정수를 입력하세요:");
        for (int i =0; i < n; i ++ ) {
            numbers[i] = scanner.nextInt();
        }
        MinNumber = MaxNumber = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < MinNumber) {
                MinNumber = numbers[i];
            }
            if (numbers[i] > MaxNumber) {
                MaxNumber = numbers[i];
            }
        }
        System.out.println("가장 작은 점수: " + MinNumber);
        System.out.println("가장 큰 점수: " + MaxNumber);


    }
}
