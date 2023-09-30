package java01.section13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x값 입력");
        String strX = scanner.nextLine(); // nextLine: 엔터 누르기 전까지 전체 문자열을 읽어라
        int x = Integer.parseInt(strX);

        System.out.println("y값 입력");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);

        while (true) {
            System.out.println("입력 문자열: ");
            String data = scanner.nextLine();
            System.out.println(data);

            if (data.equals("q")) {
                break;
            }
        }
    }
}
