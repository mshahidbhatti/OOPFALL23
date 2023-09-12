package week02_A;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(2,3);
        Rectangle r2=new Rectangle(4,5);
        Rectangle smallRec=r2.getMinRect(r1,r2);
    }
}
