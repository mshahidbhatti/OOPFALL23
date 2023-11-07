package week09_a;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {


    public static void main(String[] args) {
//
//
//
//
//        Comparable comparable=new Comparable() {
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        };
//
//        Comparable<String> comparable1=new Comparable<String>() {
//            @Override
//            public int compareTo(String o) {
//                return 0;
//            }
//        };
//
//        PrintIt pit=new PrintIt();
//        pit.print();
//
//        Printable printable=new Printable() {
//            @Override
//            public void print() {
//
//            }
//        };
//

        Comparator<Integer> comparator=(x,y) -> x<y?1:-1;

        Printable printable=(x) ->  x;

       // print(printable);
        getComparator(comparator);


        ArrayList<String> list =new ArrayList<>();
        list.add("abc");
        list.add("123");
        list.add("456");

        //list.forEach((e)-> System.out.println(e));

        list.forEach((e)-> System.out.println(e));


    }
    public static void print(Printable p){
        p.print(0);
    }


    public static void getComparator(Comparator c){
        System.out.println(c.compare(4,3));
    }
}
