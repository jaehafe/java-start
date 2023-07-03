package ch06.section06.example01;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car("BMW", "red", 100);

        // Car 객체 필드 값 읽기
        System.out.println("모델명: " + myCar.model);
        System.out.println("시동: " + myCar.start);
        System.out.println("속도: " + myCar.maxSpeed);


    }
}
