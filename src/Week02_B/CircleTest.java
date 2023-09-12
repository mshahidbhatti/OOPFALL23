package Week02_B;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1=new Circle(0,0,020);
        Circle c2=new Circle(10,10,25);

//        Circle c3=new Circle(c1.getRadius());
        Circle c3=c1.clone();


        Circle temp2=c1;

        //c1.radius
        c1.setRadius(1345);
        double area= c1.calArea();

//        System.out.println(c1+":"+area);
//        System.out.println(c2+":"+c2.calArea());

        Circle temp=Circle.getLargestCircle(c1,c2);
        temp.setRadius(10);

        System.out.println("temp"+temp.calArea());
        System.out.println("c1"+c1.calArea());
        System.out.println("c2"+c2.calArea());


        System.out.println(c1);
        System.out.println(temp);
        //Circle c3=c1.getLargestCircle(c1,c2);
    }
}
