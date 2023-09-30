package java01.ch0601.section6.exam01;

public class Ex6_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel 값은 " + t1.channel);
        System.out.println("t1의 channel 값은 " + t2.channel);

        t1.channel = 7;
        System.out.println("t1.channel 의 값 " + t1.channel + " 로 변경");

        t1 = t2;
        System.out.println("t1.channel: " + t1.channel);
        System.out.println("t2.channel: " + t2.channel);

        System.out.println("-----------");

        t1.channel = 7;
        System.out.println("t1.channel: " + t1.channel);
        System.out.println("t2.channel: " + t2.channel);
    }
}
