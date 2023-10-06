package week05_b.inheritanceADeeperLook;



public class Circle extends Shape2D {

    double radius;

    int x;

    @Override
    public double calArea(){
        return Math.PI*Math.pow(radius,2);
    }

//    public double calArea(int a){
//        return  0;
//    }



}
