package ch06.section10.exam02;

public class Television {
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;

    static {
        System.out.println("1");
        info = company;
        info += "-" + model;
    }

    static {
        System.out.println("2");
    }

}
