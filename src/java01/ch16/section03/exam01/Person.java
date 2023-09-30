package java01.ch16.section03.exam01;

public class Person {
    public void action1(Workable workable) {
        workable.work("Adam", "programming");
    }

    public void action2(Speakable speakable) {
        speakable.speak("Hello");
    }
}
