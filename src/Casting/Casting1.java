package Casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; //int -> long
        System.out.println(longValue);

        doubleValue = intValue; // int -> double
        System.out.println(doubleValue);

        doubleValue = 20L; //long->double
        System.out.println(doubleValue);

    }
}
