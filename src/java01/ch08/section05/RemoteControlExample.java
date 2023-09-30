package java01.ch08.section05;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc.setMute(true);
        rc.setMute(false);
        System.out.println("current volume: " + rc.getVolume());

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);
        System.out.println("current volume: " + rc.getVolume());

        RemoteControl.changeBattery();
    }
}
