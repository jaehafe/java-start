package java01.ch13.section01.exam01;

public class BoxExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>();
        box1.content = "string";
        String str = box1.content;
        System.out.println(str);

        System.out.println("-------");

        Box<Integer> box2 = new Box<Integer>();
        box2.content = 123;
        int value = box2.content;
        System.out.println(value);
    }
}
