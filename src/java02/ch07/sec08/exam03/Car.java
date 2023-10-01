package java02.ch07.sec08.exam03;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("no gas");
            return false;
        }
        System.out.println("has gas");
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("gas: " + gas);
                gas -= 1;
            } else {
                System.out.println("gas: " + gas);
                return;
            }
        }
    }
}
