package java02.ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 정의
        Car myCar = new Car();

        // Tire 객체 정의
        myCar.tire = new Tire();
        myCar.run();

        // HankookTire 객체 정의
        myCar.tire = new HankookTire();
        myCar.run();

        // KumhoTire 객체 정의
        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
