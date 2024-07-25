package Scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종류를 입력하면 종료): ");
            String name = input.nextLine(); //Line까지 읽어오는데 "" 빈문자

            if (name.equals("종료")) {
                System.out.print("프로그램을 종료합니다.");
                break;

            }
            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt();
            input.nextLine();


            System.out.println("입력한 이름 " + name + ", 나이 " + age );
        }
    }
}
