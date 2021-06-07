import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
 
public class ConsumerApp {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        add(set, (Consumer<Set<Integer>>) s -> s.add(10)); //Line n1
        add(set, (Predicate<Set<Integer>>) s -> s.add(20)); //Line n2
 

        add(set, s-> { s.add(30); return; } ); //Line n3
        add(set, s->  { return s.add(40); } ); //Line n4

        //add(set, s->  s.add(50) ); //Line n5 - ambigouous

        System.out.println(set.size());
    }
 
    private static void add(Set<Integer> set, Consumer<Set<Integer>> consumer) { //Line n3
        consumer.accept(set);
    }
 
    private static void add(Set<Integer> set, Predicate<Set<Integer>> predicate) { //Line n4
        predicate.test(set);
    }
}