package java02.ch06.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("lee", "123-123");

        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);

        System.out.println();

        Korean k2 = new Korean("park", "123-345");

        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);
    }
}
