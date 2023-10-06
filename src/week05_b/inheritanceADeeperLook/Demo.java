package week05_b.inheritanceADeeperLook;



public class Demo {
    public static void main(String[] args) {

        Vehicle v1;//=new Vehicle();
        v1=new TwoWheelVehicles();

        Shape obj=new Shape();

        Shape2D obj1=new Shape2D(); //is a Shape
   //     System.out.println(obj1);
        System.out.println(obj1.min(2,3));
        Shape3D obj3=new Shape3D(); // is a Shape

        Circle obj4=new Circle();
        Rectangle obj5=new Rectangle();



    }
}
