package java01.ch06.section06.example02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("손흥민", "1992");
        Korean k2 = new Korean("이강인", "2001");

        System.out.println(k1.name + k1.nation + k1.ssn);
        System.out.println(k2.name + k2.nation + k2.ssn);
    }
}
