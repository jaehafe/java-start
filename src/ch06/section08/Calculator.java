package ch06.section08;

public class Calculator {
    void powerOn() {
        System.out.println("power on");
    }

    void powerOff() {
        System.out.println("power off");
    }

    int plus(int x, int y) {
        int result = x + y;
        System.out.println(result);
        return result;
    }

    double divide(int x, int y) {
        double result = (double) x / (double) y;
        System.out.println(result);
        return result;
    }

    void method() {
        powerOn();
        int r1 = plus(3, 5);
        double r2 = divide(15, 3);
    }

}
