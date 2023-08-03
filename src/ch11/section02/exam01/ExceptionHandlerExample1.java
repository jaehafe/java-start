package ch11.section02.exam01;

public class ExceptionHandlerExample1 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//            e.printStackTrace();

        } finally {
            System.out.println("마무리 실행");
        }
    }

    public static void main(String[] args) {
        System.out.println("start program");
        printLength("Java");
        printLength(null);
        System.out.println("finish program");
    }
}
