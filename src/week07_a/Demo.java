package week07_a;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        Scanner input=new Scanner(System.in);

        int list[]={0,1,2,3};

        //risky statement
        System.out.println(list[0]);


        A obj;
        //System.out.println(obj.getA());

        a=input.nextInt();
        b=input.nextInt();
        System.out.println("a / b ="+(a/b));
    }
}
