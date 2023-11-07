package week09_a;

public class A <T>{

    T t;
    A(T t)
    {
        this.t=t;
    }

    public void setT(T t){
        this.t=t;
    }
    public T getT(){
        return t;
    }

    public boolean equals(Object o){
        T a= (T)o;
        return this.equals(a);
    }
}
