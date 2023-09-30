package java01.ch08.section05;

public class Audio implements RemoteControl {
    private int volume;
    private int memoryVolume;

    @Override
    public void turnOn() {
        System.out.println("turn on Audio");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off Audio");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("tv volume: " + volume);
    }


    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("mute mode");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("no mute mode");
            setVolume(this.memoryVolume);
        }
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
