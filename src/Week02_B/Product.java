package Week02_B;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    static int counter=0;
    private Date mfcDate;
    // private Date manfacutingDate;

    {
 //       System.out.println("from unamed code block 1");
        counter++;
    }
    static{
 //       System.out.println("from unamed static code block 1");
    }
    {
        //System.out.println("from unamed code block 2");
        counter--;
    }
    Product(String name, double price, int quantity,Date mfcDate){
 //       System.out.println("Constructor is called");
        this.id=counter++;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.mfcDate=mfcDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getId() {
        return id;
    }

    public Date getMfcDate() {
        return mfcDate;
    }

    public void setMfcDate(Date mfcDate) {
        this.mfcDate = mfcDate;
    }

    public String toString(){
        String productDetails=String.format("%04d\t%-20s%,.2f\t%d \t %s",id,name,price,quantity,mfcDate);
        return productDetails;
    }

    public static void staticMethod(){

        //System.out.println(id);
    //    System.out.println("call of static method");
    }
    public void nonStatic(){
        //System.out.println(counter);
    }

    public Product isLatest(Product p1, Product p2){
        Date temp=mfcDate.isRecentDate(p1.mfcDate,p2.mfcDate);
        return temp==p1.mfcDate?p1:p2;
    }
}
