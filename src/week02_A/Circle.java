package week02_A;

public class Circle {
   private  double radius;


    public void setRadius(double radius){
        if(radius>=0)
            this.radius=radius;

    }
    public double getRadius(){

        return radius;
    }
    public double calArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double calCircumference(){
        return 2*Math.PI*this.radius;
    }
}
