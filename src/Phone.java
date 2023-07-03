public class Phone {
    // 필드 선언
    public String model;
    public String color;

    // 메서드 선언
    public void bell() {
        System.out.println("벨");
    }

    public void sendVoice(String message) {
        System.out.println("send: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("receive: " + message);
    }

    public void hangUp() {
        System.out.println("전화 끊기");
    }
}
