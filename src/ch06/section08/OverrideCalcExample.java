package ch06.section08;

public class OverrideCalcExample {
    public static void main(String[] args) {
        OverrideCalc myCalc = new OverrideCalc();

        double result1 = myCalc.areaRectangle(10);

        double result2 = myCalc.areaRectangle(10, 20);

        System.out.println(result1);
        System.out.println(result2);
    }
}
