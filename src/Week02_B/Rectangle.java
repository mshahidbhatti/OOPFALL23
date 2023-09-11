package Week02_B;

public class Rectangle {
     private double length;
     private double width;

    public double area(){
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>0)
            this.length = length;
    }


}
