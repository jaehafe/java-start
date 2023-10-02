package java02.ch07.sec05.exam02;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }
//    오버라이딩 불가
//    @Override
//    public void stop() {
//        System.out.println("stops sports car");
//        speed = 0;
//    }
}
