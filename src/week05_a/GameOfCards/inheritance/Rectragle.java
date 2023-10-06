package week05_a.GameOfCards.inheritance;

public class Rectragle extends Shape2D{
    double side1;
    double side2;

    public Rectragle(int x, int y, double side1, double side2) {
        super(x, y);
        this.side1 = side1;
        this.side2 = side2;
    }


    @Override
    public double calArea(){
        return side1*side2;
    }
}
