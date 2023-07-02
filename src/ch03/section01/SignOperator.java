package ch03.section01;

public class SignOperator {
    public static void main(String[] args) {
//        int x = -100;
//        x = -x;
//        System.out.println("x: " + x);
//
//        byte b = 100;
//        int y = -b;
//        System.out.println("y: " + y);

        int x = 1;
        int y = 1;

        int result1 = ++x + 10;
        int result2 = y++ + 10;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(y);

        System.out.println("-------------------------");

        byte var1 = 125;
        for (int i = 0; i < 5; i++) {
            var1++;
            System.out.println("var1: " + var1);
        }
    }
}
