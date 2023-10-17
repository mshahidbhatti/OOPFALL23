package week06_a.secondclass;

public class CountedProducts extends Product{
    int count;

    public CountedProducts(String id, double price, String name, int count) {
        super(id, price, name);
        this.count = count;
    }

    @Override
    public double getNetPrice(){
        return price*count;
    }

    @Override
    public String toString() {
        return String.format("%s \t %d",super.toString(),count);
    }


}
