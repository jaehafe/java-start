package ch08.section05;

public interface RemoteControl {
    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메서드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    int getVolume();

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("mute mode");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("not mute mode");
        }
    }
}
