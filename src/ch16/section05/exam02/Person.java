package ch16.section05.exam02;

public class Person {
    public void ordering(Comparable comparable) {
        String a = "Adam";
        String b = "John";

        int result = comparable.compare(a, b);

        if (result > 0) {
            System.out.println(a + "is ahead of" + b);
        } else if (result == 0) {
            System.out.println(a + "is same with" + b);
        } else {
            System.out.println(a + "is behind of" + b);
        }
    }
}
