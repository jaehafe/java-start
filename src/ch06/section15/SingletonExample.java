package ch06.section15;

public class SingletonExample {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 Singleton 객체임");
        } else {
            System.out.println("같은 Singleton 객체 아님");
        }
    }
}
