package ch11.section03;

public class ExceptionHandlerExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println(array[i]);
                int value = Integer.parseInt(array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
