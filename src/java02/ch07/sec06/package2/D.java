package java02.ch07.sec06.package2;

import java02.ch07.sec06.package1.A;

// package1.A 상속
public class D extends A {
//    private A ;

    public D() {
        // A() 생성자 호출
        super();
    }

    // 상속을 통해서 사용 가능
    public void method1() {
        this.field = "value";
        this.method();
    }

    public void method2() {
//        A a = new A();
//        a.field = "value" // private 불가
//        a.method();
    }
}
