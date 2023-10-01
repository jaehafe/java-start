package java02.ch06.sec10.exam01;

public class CalcExample {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calc.pi;
        int result2 = Calc.plus(10, 5);
        int result3 = Calc.minus(10, 5);


        System.out.println(result1 + " " + result2 + " " + result3);

    }
}
