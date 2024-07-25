package Scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum =0;
        int count =0;
        int input =0;

        System.out.println("숫자를 입력하세요. 입력을 중단하시려면 -1을 입력하세요:");
      /*  while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
            count++;
        }
*/
        while ((input = scanner.nextInt()) !=-1) { //입력 받을 때 거짓을 확인할 수 있다.
            sum += input;
            count++;
        }
        double average =(double) sum / (double) count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);

    }
}
