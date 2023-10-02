package java02.ch09.sec04.exam03;

public class A {
    public void method1(int arg) {
        int var = 1;

        class B {
            void method2() {
                // 로컬 변수 읽기
                System.out.println("arg: " + arg);
                System.out.println("var: " + var);

                // 로컬 변수 수정 불가
            }
        }

        B b = new B();
        b.method2();
    }
}
