package week05_b.inheritanceADeeperLook;

public class Shape2D extends Shape{
   // static int y=20;
    protected String x="Two";
@Override
    public int getX() {
        return super.x;
    }

    public void setX(String x) {
        this.x = x;
    }
    public String toString(){
    return super.toString()+", x:"+this.x;
    }
    public static int min(int x, int y){
    return x<y?x:y;
    }

    public final int  sum(int a, int b, int c){
        return a+b;
    }
}
