public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("iPhone12", "green");

        System.out.println(myPhone.model);
        System.out.println(myPhone.color);

        System.out.println(myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("hi");
        myPhone.receiveVoice("hey");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
