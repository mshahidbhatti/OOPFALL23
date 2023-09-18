package Week02_B;

public class Shop {
    public static void main(String[] args) {

        Product p4=new Product("product 1",1,1, new Date(15,9,2023));
        System.out.println(p4);

        Product p5=new Product("product 2",1,1, new Date(15,10,2023));
        System.out.println(p5);

        System.out.println(p4.isLatest(p4,p5));
//        Date d=new Date(15,9,2023);
//        System.out.println(d);
//        Product.staticMethod();
//
//        Product p1=new Product("LCD", 50000, 2);
//        Product p2=new Product("Keboard",700,10);
//        Product p3=new Product("Keboard wireless",700,10);
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
    }
}
