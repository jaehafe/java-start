package ch13.section03.exam01;

public class GenericExample {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();

        Box<String> box2 = boxing("java");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}
