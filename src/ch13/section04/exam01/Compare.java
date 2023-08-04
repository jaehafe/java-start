package ch13.section04.exam01;

public class Compare<T extends Number> {
    public boolean compare(T t1, T t2) {
        System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");

        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return (v1 == v2);
    }
}
