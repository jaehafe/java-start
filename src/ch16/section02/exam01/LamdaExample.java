package ch16.section02.exam01;

public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //실행문이 두 개 이상일 경우 중괄호 필요
        person.action(() -> {
            System.out.println("working");
            System.out.println("programming");
        });

        //실행문 하나 -> 중괄호 생략 가능
        person.action(() -> System.out.println("working off"));
    }
}
