package Homework;

public class Rectangle {
    double width;
    double length;

    public Rectangle(double widthParam, double lengthParam) {
        this.width = widthParam;
        this.length = lengthParam;
//        width = 0;
//        length = 0;

    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }
}
