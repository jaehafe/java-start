package ch06.section08;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(5);
        System.out.println(myCar.gas);

        if (myCar.isLeftGas()) {
            myCar.run();
        }
        System.out.println("no left gas");
    }
}
