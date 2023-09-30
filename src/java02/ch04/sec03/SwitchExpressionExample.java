package java02.ch04.sec03;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("good");
            }
            case 'B', 'b' -> {
                System.out.println("soso");
            }
            case 'C', 'c' -> {
                System.out.println("not good");
            }
        }
    }
}
