package java01.ch0601.section8.exam01;

public class ArrayExample {
    public static void main(String[] args) {
        Time t = new Time();

        t.hour = 12;
        t.minute = 34;
        t.second = 56;

        System.out.println(t.hour + " " + t.minute + " " + t.second);
    }
}
