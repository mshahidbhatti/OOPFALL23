package week05_b.inheritanceADeeperLook;

public class Cube extends Shape3D{
    double side;


    @Override
    protected double calArea(){
        return side*side*6;
    }
}
