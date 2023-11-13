package week09_b;

import java.util.ArrayList;

public class Driver {

    class C{
        
    }
    public static void main(String[] args) {


        StringConsumer stringConsumer=(e,i) -> i;

        stringConsumer.print("hello",111);


        ArrayList<String> list=new ArrayList<>();
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
        list.add("String 4");

        list.forEach( e-> {System.out.println(e);
        }
        );

        ArrayList<Integer> list2=new ArrayList<>();


//        for(String s:list)
//            System.out.println(s);

//        PrintThings printThings = new PrintThings();
//        printThings.print();
//
//        Printable printable = new Printable() {
//            @Override
//            public void print() {
//                System.out.println("anonymous innner class");
//            }
//        };
//        // printable.print();
//        //printIt(printable);
//
//        Printable printable1 = () -> System.out.println("anonymous innner class simplified method");
//
//        printIt(printable1);
    }

    public static void printIt(Printable printable){
        printable.print();
    }

/*    public static  void consumeString(StringConsumer stringConsumer){
        stringConsumer.print(" ",0);
    }*/
}
