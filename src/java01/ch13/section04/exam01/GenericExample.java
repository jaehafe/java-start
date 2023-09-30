package java01.ch13.section04.exam01;

public class GenericExample {
    public static void main(String[] args) {
        Compare<Integer> integerCompare = new Compare<>();
        boolean result1 = integerCompare.compare(10, 20);
        System.out.println(result1);

        System.out.println("---------");

        Compare<Double> doubleCompare = new Compare<>();
        boolean result2 = doubleCompare.compare(4.5, 4.5);
        System.out.println(result2);
    }
}
