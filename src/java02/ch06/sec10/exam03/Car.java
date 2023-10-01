package java02.ch06.sec10.exam03;

public class Car {
    int speed;

    void run() {
        System.out.println(speed);
    }

    static void simulate() {
        Car myCar = new Car();
        myCar.speed = 20;
        myCar.run();
    }

    public static void main(String[] args) {
        simulate();

        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
