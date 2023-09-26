package week03_b;

import java.util.Scanner;

public class ReadFromKeyBoard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner textInput=new Scanner(System.in);
        
        System.out.print("Enter Day:");
        int day=sc.nextInt();
        System.out.print("Enter Month:");
        int month=sc.nextInt();
        System.out.print("Enter Year:");
        int year=sc.nextInt();

        Date date=new Date(day,month,year);
        System.out.println(date);

    }
}
