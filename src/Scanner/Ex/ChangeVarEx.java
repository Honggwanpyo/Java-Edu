package Scanner.Ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp; //a의 값 10

        temp = a; //10
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);



    }
}
