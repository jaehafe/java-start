package ch06.section06.example01;

public class Car {
    // 필드 선언
    String company = "BMW";
    String model;
    String color;
    int maxSpeed;

    // 생성자 선언
    Car(String model) {
        this(model, "silver", 250);
    }

    Car(String model, String color) {
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
