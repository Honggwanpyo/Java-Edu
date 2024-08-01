package array.ex;

import java.util.Scanner;

public class ArrayEx41 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력하세요:");
        int count = number.nextInt();

        int[] numbers = new int[count];
        int total = 0;
        double average;

        System.out.println(count+"개의 정수를 입력하세요: ");
        for (int i = 0 ; i < count ; i++) {
            numbers[i] = number.nextInt();
            total += numbers[i];
        }

        average = (double) total / count;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}