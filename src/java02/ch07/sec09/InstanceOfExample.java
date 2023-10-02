package java02.ch07.sec09;

public class InstanceOfExample {
    public static void personInfo(Person person) {
        System.out.println("name: " + person.name);
        person.walk();

        if (person instanceof Student student) {
            System.out.println("studentNo: " + student.studentNo);
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Adam");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("James", 20);
        personInfo(p2);
    }


}
