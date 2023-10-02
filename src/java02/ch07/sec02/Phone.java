package java02.ch07.sec02;

public class Phone {
    public String model;
    public String color;

    public void bell() {
        System.out.println("bell");
    }

    public void sendVoice(String message) {
        System.out.println("send: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("receive: " + message);
    }

    public void hangUp() {
        System.out.println("hang up");
    }
}
