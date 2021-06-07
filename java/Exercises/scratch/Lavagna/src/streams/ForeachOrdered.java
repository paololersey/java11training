package streams;

import java.util.List;
import java.util.Optional;

public class ForeachOrdered {
    public static void main(String[] args) {
       var fruits = List.of("apple","orange","banana","lemon");
       fruits.stream().filter(f -> f.contains("n")).forEachOrdered(x -> System.out.println(x));
       
       Optional<String> res = fruits.stream().filter(f -> f.contains("n")).findFirst();
       System.out.println(res.get());
    }
}
