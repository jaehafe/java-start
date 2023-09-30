package java01.ch11.section02.exam02;

public class ExceptionHandlerExample1 {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            System.out.println("주어진 클래스가 없습니다.");
            e.toString();

        } finally {
            System.out.println("마무리 실행");
        }

        System.out.println("--------------");

        try {
            Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) {
            System.out.println("주어진 클래스가 없습니다.");
            e.toString();
        } finally {
            System.out.println("마무리 실행");
        }
    }
}
