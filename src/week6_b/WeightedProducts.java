package week6_b;

public class WeightedProducts extends Product{
    double weight;

    public WeightedProducts(String id, String name, double price, double weight) {
        super(id, name, price);
        this.weight = weight;
    }

    @Override
    public double getNetPrice(){
        return weight*price;
    }

    @Override
    public String toString() {
        return "WeightedProducts{" +
                "weight=" + weight +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
