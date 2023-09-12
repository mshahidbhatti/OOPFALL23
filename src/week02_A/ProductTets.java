package week02_A;

public class ProductTets {
    public static void main(String[] args) {
        Product p1=new Product("Keyboard", 500, 3);
        Product p2=new Product("LCD",20000, 3);
        Product p3=new    Product("Laptop",50000,4);

//        System.out.println(p1.toString());
//        System.out.println(p2);
//        System.out.println(p3);

  //      Product temp=new Product(p1.getName(),p1.getPrice(),p1.getQuantity());
        Product temp=p1.clone();

        System.out.println(p1);
        System.out.println(temp);
        temp.setName("connector");
        int x=10;
        System.out.println();
        System.out.println(p1);
        System.out.println(temp);
    }
}
