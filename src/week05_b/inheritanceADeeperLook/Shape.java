package week05_b.inheritanceADeeperLook;

public class Shape {
    static int y=10;
    protected int x=1;
    Point centerPoint;

    protected double calArea(){
        return 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String toString(){
        return String.valueOf(x);
    }

    public static int min(int x, int y){
        return x>y?x:y;
    }

    public final int  sum(int a, int b){
        return a+b;
    }
}
