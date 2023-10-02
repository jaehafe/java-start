package java02.ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.move();

        Bus bus = (Bus) vehicle;
        bus.move();
        bus.CheckFare();
    }
}
