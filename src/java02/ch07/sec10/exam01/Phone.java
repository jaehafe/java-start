package java02.ch07.sec10.exam01;

public abstract class Phone {
    String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("turning on the " + this.owner + "'s " + "phone");
    }

    void turnOff() {
        System.out.println("turning off the phone");
    }
}
