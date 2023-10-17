package week06_a.secondclass;

public class InventoryManagement extends Requirements{

    Product list[];
    int counter=0;

    InventoryManagement(int capacity){
        list=new Product[capacity];
    }

    public boolean add(Product p){
        if(list.length>counter) {
            list[counter++] = p;
            return true;
        }
        return  false;
    }

    public boolean remove(Product p){
        for(int i=0;i<list.length;i++)
        {
            if(p!=null) {
                if (p.equals(this)) {
                    list[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    public void displayProducts(){
        for (Product p:list)
            if(p!=null)
            System.out.println(p);
    }
}
