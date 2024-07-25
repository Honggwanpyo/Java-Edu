package Cond;

public class Switch2 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (1) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 3000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println(coupon);

    }
}