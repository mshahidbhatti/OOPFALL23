package week03_a;

public class Product {
    private String name;
    private  int id;

    static int counter=0;
    private double price;

    private Date mfcDate;

    private int quantity;

    {
        System.out.println("Inside code block A");
    }


//    Product(String name, double price, int quantity){
//        System.out.println("constructor called");
//        id=counter++;
//        this.name=name;
//        this.price=price;
//        this.quantity=quantity;
//    }
Product(String name, double price, int quantity, Date mfcDate){
    System.out.println("constructor called");
    id=counter++;
    this.name=name;
    this.price=price;
    this.quantity=quantity;
    this.mfcDate=mfcDate;
}

    static{
        System.out.println("static block A");
    }
    {
        System.out.println("Inside code block B");
    }
    static{
        System.out.println("static block B");
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

//    public Product clone(){
//       return new Product(this.getName(),this.getPrice(),this.getQuantity());
//
//    }


    public Date getMfcDate() {
        return mfcDate;
    }

    public void setMfcDate(Date mfcDate) {
        this.mfcDate = mfcDate;
    }
    public Product getLatest(Product p1, Product p2){
//        Date temp=mfcDate.getRecentDate(p1.mfcDate,p2.mfcDate);
//        if(temp==p1.mfcDate)
//            return p1;
//        else return p2;
        return p1.mfcDate==mfcDate.getRecentDate(p1.getMfcDate(),p2.getMfcDate())?p1:p2;
    }

//    public boolean equals(Object o){
//        Product p=(Product)o;
//
//        return p.id==this.id?true:false;
//    }

}
