package week09_a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        A<String> obj=new A("abc");

        A<Number> obj2=new A<>(5);
        HashMap<String, Integer> maps=new HashMap<>();

        Box<Object, Object> box1=new Box();

        Box<String, Integer> box2=new Box<>();


    }


}
