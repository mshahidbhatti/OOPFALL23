package week06_a.secondclass;

public class WeightedProduct extends Product{
    double weight;

    public WeightedProduct(String id, double price, String name, double weight) {
        super(id, price, name);
        this.weight = weight;
    }


    @Override
    public double getNetPrice(){
        return weight*price;
    }

    @Override
    public String toString() {
        return String.format("%s \t %.2f",super.toString(),weight);
    }

}
