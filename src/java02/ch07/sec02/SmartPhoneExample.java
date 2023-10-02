package java02.ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("iPhone", "white");


        System.out.println(myPhone.model);
        System.out.println(myPhone.color);

        System.out.println(myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("send voice");
        myPhone.receiveVoice("receive voice");
        myPhone.sendVoice("send voice1");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
