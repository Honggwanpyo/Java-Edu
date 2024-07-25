package Casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue;
//        System.out.println(intValue);
        intValue = (int) doubleValue; //형변환
        System.out.println(intValue); //출력 1

        int z = (int) 10.5;
        System.out.println(z);
    }
}
