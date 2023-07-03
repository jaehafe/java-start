package ch06.section13.exam02.package1;

public class A {
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    public A(boolean b) {

    }

    // default: 같은 package 내에서만 사용 가능
    A(int i) {

    }

    // private: 같은, 다른 package 사용 불가, 같은 클래스 내에서만 사용 가능
    private A(String s) {

    }
}
