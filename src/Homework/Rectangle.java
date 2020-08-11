package Homework;

public class Rectangle {
    double width = 0;
    double length = 0;

    public Rectangle(double widthParam, double lengthParam) {
        this.width = widthParam;
        this.length = lengthParam;

    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        double area = (length * width);
        return area;
    }
}
