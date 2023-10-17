package week07_a;

public class A {
    int a=4;

    public A(int a) throws IllegalAccessException {
        if(a<0)
        //    throw new IllegalAccessException("");
        this.a = a;
    }

    public int getA() {
        return a;
    }
}
