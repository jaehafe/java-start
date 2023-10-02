package java02.ch08.sec11.exam01;

public class Car {
    Tire tire1 = new HankookTire();
    Tire tire2 = new KumhoTire();

    void move() {
        tire1.move();
        tire2.move();
    }
}
