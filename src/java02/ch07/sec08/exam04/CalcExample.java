package java02.ch07.sec08.exam04;

public class CalcExample {
    public static void main(String[] args) {
        Calc myCalc = new Calc();

        double result1 = myCalc.areaRectangle(10);

        double result2 = myCalc.areaRectangle(10, 20);

        System.out.println(result1);
        System.out.println(result2);
    }
}
