package ch07.section03.exam01;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        super(); // 생략 가능
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행");
    }
}
