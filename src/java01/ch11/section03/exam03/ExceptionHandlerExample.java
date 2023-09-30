package java01.ch11.section03.exam03;

public class ExceptionHandlerExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과: " + e.getMessage());
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("문자열이 없거나 항목 수가 부족: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("에상치 못한 예외 발생");
            }
        }
    }
}
