package java01.ch07.section04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator comp = new Computer();
        System.out.println("원 면적: " + comp.areaCircle(r));
    }
}
