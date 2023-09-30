package java01.ch13.section02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("스마트 Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();
        System.out.println(tv + tvModel);

        System.out.println("---------");

        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV Car");

        Car car = product2.getKind();
        String carModel = product2.getModel();
        System.out.println(car + carModel);
    }
}
