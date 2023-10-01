package java02.ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(5);

        if (myCar.isLeftGas()) {
            System.out.println("出发");

            myCar.run();
        }

        System.out.println("请加一下煤气");
    }
}
