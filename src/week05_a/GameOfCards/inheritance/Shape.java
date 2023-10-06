package week05_a.GameOfCards.inheritance;

public class Shape {
    int x;
    int y;

//    Shape(){
//       x=1;
//       y=1;
//    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return  "x=" + x +", y=" + y ;
    }

    public double calArea(){
        return 0;
    }
}
