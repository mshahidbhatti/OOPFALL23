package week07_b;

public class Circle {
    double radius;

    public Circle(double radius) {
        if(radius>0)
        this.radius = radius;
        else
            throw new IllegalArgumentException("Invalid radius");
    }
}
