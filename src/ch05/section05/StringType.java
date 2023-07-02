package ch05.section05;

public class StringType {
    public static void main(String[] args) {
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = new String("홍길동");

        System.out.println(name1 == name2); // true
        System.out.println(name1 == name3); // false

//        boolean result = name1.equals(name2);
        boolean result = !name1.equals(name2);
        System.out.println(result); // false

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동"); // 둘 참조가 다름

        if(strVar3 == strVar4) { // false
            System.out.println("strVar3, strVar4 참조가 같음");
        } else {
            System.out.println("strVar3, strVar4 참조가 다름");
        }

        if(strVar3.equals(strVar4)) { // true
            System.out.println("strVar3, strVar4 문자열이 같음");
        }
    }
}
