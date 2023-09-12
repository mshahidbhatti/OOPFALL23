package week02_A;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calArea() {
        return length * width * 2;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }


    public Rectangle getMinRect(Rectangle r1, Rectangle r2) {
        if (r1.calArea() < r2.calArea())
            return r1;
        else
            return r2;
    }
}
