package week07_a.inhertanceExtended;

import week05_b.Person;

public class InterfaceTest {
    public static void main(String[] args) {
        Payable obj1=new Employee("","","");
        obj1.getPayableAmount();
        Person obj2=new Employee("","","");

        Payable obj3=new Invoice();

        Payable obj4=new Payable() {
            @Override
            public double getPayableAmount() {
                return 0;
            }
        };


    }
}
