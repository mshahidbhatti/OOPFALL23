package Week02_B;

public class Circle {
    //data
    private double radius;
    private  int x=0;
    private int y=0;

    //default constructor
    Circle(int x, int y, double radius){
//        System.out.println("constructor is called");
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    //methods
    public void setRadius(double radius){
        if(radius>=0)
            this.radius=radius;

    }
    public double getRadius(){
        return radius;
    }
    public double calArea(){
        return Math.PI*radius*radius;
    }
    public double calCircumference(){
        return  Math.PI*2*radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static Circle getLargestCircle(Circle circle1, Circle circle2){

        if(circle1.radius<circle2.radius)
            return circle2;
        else return circle1;
    }

    public Circle clone(){
        return new Circle(this.x,this.y,this.radius);
    }
}
