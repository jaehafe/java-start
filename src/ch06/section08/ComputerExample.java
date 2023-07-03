package ch06.section08;

public class ComputerExample {
    public static void main(String[] args) {
        Computer computer = new Computer();

        int result = computer.sum(1, 2, 3);
        System.out.println(result);

        int[] values = {1, 2, 3, 4, 5};
        int result3 = computer.sum(values);
        System.out.println(result3);

        int result4 = computer.sum(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(result4);
    }
}
