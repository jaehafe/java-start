package ch09.section07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run1();

        car.run2();

        car.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("anonymous Tire 3 is moving");
            }
        });
    }
}
