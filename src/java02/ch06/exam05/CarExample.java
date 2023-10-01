package java02.ch06.exam05;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car("A5");
        System.out.println(car1.company + car1.model);

        Car car2 = new Car("A5", "red");
        System.out.println(car2.company + car2.model + car2.color);

        Car car3 = new Car("taxi", "black", 200);
        System.out.println(car3.company + car3.model + car3.color + car3.maxSpeed);
    }
}
