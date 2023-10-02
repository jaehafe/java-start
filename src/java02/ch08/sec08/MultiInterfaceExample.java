package java02.ch08.sec08;

public class MultiInterfaceExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTelevision();
        searchable.search("vercel.com");
    }
}
