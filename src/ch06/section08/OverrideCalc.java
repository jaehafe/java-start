package ch06.section08;

public class OverrideCalc {
    double areaRectangle(double width) {
        return width * width;
    }

    double areaRectangle(double width, double height) {
        return width * height;
    }
}
