package week06_a.secondclass;

public class Demo {
    public static void main(String[] args) {

//        Product p;//=new Product("1",100,"p1");
//        CountedProducts cp1=new CountedProducts("2",20,"cp1",20);
//        p=new CountedProducts("2",20,"cp1",20);
//        p.getNetPrice();
//        p=new WeightedProduct("wp",30,"wp1",12.9);
//        p.getNetPrice();

        InventoryManagement im=new InventoryManagement(100);
        im.add(new CountedProducts("2",20,"cp1",20));
        im.add(new WeightedProduct("wp",30,"wp1",12.9));
        im.displayProducts();

        im.remove(new CountedProducts("2",20,"cp1",20));
        im.displayProducts();
    }
}
