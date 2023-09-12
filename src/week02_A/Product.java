package week02_A;

public class Product {
    private String name;
    private  int id;

    static int counter=0;
    private double price;

    private int quantity;

    Product(String name, double price, int quantity){
        id=counter++;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString(){
        return String.format("%03d %-20s %.2f %d",this.id,this.name,this.price,this.quantity);
    }

    public Product clone(){
       return new Product(this.getName(),this.getPrice(),this.getQuantity());

    }
}
