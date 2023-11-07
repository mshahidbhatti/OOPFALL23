package temp;

import java.util.Arrays;
import java.util.List;

public class temp0 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        long count = fruits.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .count();
        System.out.println(count);

        fruits.stream().filter(fruit->fruit.endsWith("y"));

    }
}
