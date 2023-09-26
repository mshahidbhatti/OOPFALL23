package week03_b;

import week03_a.Product;

public class Demo {
    public static void main(String[] args) {
        Student std1=new Student("Haris","081");
        Student std3=new Student("Haris","081");
        Student std2=new Student("Kamran","131");

//        boolean b=std1==std3;
        boolean b=std1.compare(std2);
        System.out.println(b);


        A.min(1,2.0);
        A.min(4,5);
        A.min(1.0,0.0);


    }
}
