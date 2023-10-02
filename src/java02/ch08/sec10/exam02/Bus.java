package java02.ch08.sec10.exam02;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bus is moving");
    }

    public void CheckFare() {
        System.out.println("Checking the fare");
    }
}
