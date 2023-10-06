package week05_a.GameOfCards.inheritance;

public class Circle extends Shape2D{
    double radius;


    public Circle(int x, int y, double radius) {
        super(x, y);
    }

    public double calArea(){
        return 2*Math.PI*Math.pow(radius,2);
    }
}
