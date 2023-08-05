package ch16.section03.exam01;

public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1((name, job) -> System.out.println(name + job));

        person.action2(word -> System.out.println(word));
    }
}
