package week6_b;

public class CountedProducts extends Product{
    int count;

    public CountedProducts(String id, String name, double price, int count) {
        super(id, name, price);
        this.count = count;
    }

    @Override
    public double getNetPrice(){
        return count*price;
    }



    @Override
    public String toString() {
        return "CountedProducts{" +
                "count=" + count +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
