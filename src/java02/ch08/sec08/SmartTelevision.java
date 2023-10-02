package java02.ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
    @Override
    public void turnOn() {
        System.out.println("turn on the TV");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off the TV");
    }

    @Override
    public void search(String url) {
        System.out.println("searching the " + url);
    }
}
