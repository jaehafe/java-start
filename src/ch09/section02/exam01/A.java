package ch09.section02.exam01;

public class A {
    // 인스턴스 멤버 클래스
    class B {
        public void methodB() {
            System.out.println("methodB() 실행");
        }
    }

    // B 객체 대입
    B field = new B();

    // 생성자
    A() {
        B b = new B();
        b.methodB();
    }

    void methodA() {
        B b = new B();
        b.methodB();
    }
}
