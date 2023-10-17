package week06_a.secondclass;

public abstract class Product {
    String id;
    double price;
    String name;

    public Product(String id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract double getNetPrice();

    @Override
    public String toString() {
        return String.format("%-10s \t %30s \t %.2f",this.id,this.name,this.price);
    }

    @Override
    public boolean equals(Object o){
        Product p=(Product) o;
        if(p instanceof CountedProducts)
        return ((CountedProducts)p).id==this.id?true:false;
        else return ((WeightedProduct)p).id==this.id?true:false;
    }
}
