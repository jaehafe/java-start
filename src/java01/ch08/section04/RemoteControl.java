package java01.ch08.section04;

public interface RemoteControl {
    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메서드
    void turnOn();

    void turnOff();

    void setVolume(int volume);
}
