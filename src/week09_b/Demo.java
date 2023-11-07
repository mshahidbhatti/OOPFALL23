package week09_b;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        list1.add(1);
        list1.add("str");


        ArrayList<String> list2=new ArrayList<>();
        list2.add("str");
       // list2.add(2);

        A<Integer> obj=new A<>(7);
        A<Integer> obj2=new A<>(12);


        B.<String>doSomeThing(" ");
        HashMap<String , Integer> map=new HashMap<>();


        C<Integer, Integer, Integer> c=new C<>();



    }
}
