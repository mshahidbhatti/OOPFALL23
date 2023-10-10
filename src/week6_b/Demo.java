package week6_b;

public class Demo {
    public static void main(String[] args) {
        InventoryManagement inventoryManagement=new InventoryManagement(100);
        inventoryManagement.add(new WeightedProducts("1","p1",12,10.0));
        inventoryManagement.add(new CountedProducts("2","cp1",20,12));

        inventoryManagement.displayList();

        inventoryManagement.remove(new WeightedProducts("1","p1",12,10.0));
        inventoryManagement.displayList();



    }
}
