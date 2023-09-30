package java01.ch07.section08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run(); // roll

        myCar.tire = new HankookTire();
        myCar.run(); // Hankook Tire roll

        myCar.tire = new KumhoTire();
        myCar.run(); // Kumho Tire roll
    }
}
