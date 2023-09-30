package java01.ch09.section03.exam01;

public class A {
    // static이 있으면 A객체가 없어도 B를 사용 사능
    static class B {
        void methodB() {
            System.out.println("methodB() 실행");
        }
    }

    static B field2 = new B();

    A() {
        B b = new B();
    }

    void method() {
        B b = new B();
    }

    static void method2() {
        B b = new B();
    }
}
