package week07_a.inhertanceExtended;

import week05_b.Person;

import java.io.Serializable;

public class Employee extends Person implements Payable, Serializable, Comparable {
    public Employee(String name, String email, String address) {
        super(name, email, address);
    }

    public double getPayableAmount(){
        return 0;
    }
    public int compareTo(Object o){
        return 1;
    }
}
