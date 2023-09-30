package java02.ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;

        switch (num) {
            case 1:
                System.out.println("1");
                return;
            case 2:
                System.out.println("2");
                return;
            case 3:
                System.out.println("3");
                return;
            case 4:
                System.out.println("4");
                return;
            case 5:
                System.out.println("5");
                return;
            default:
                System.out.println("6");
        }
    }
}
