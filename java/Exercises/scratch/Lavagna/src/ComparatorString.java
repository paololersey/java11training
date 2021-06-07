import java.util.Comparator;
import java.util.stream.Stream;

public class ComparatorString {
    
        public static void main(String[] args) {
            Stream<String> stream = Stream.of("d", "a", "mm", "bb", "zzz", "www");
            Comparator<String> lengthComp = (s1, s2) -> s1.length() - s2.length();
            //stream.sorted(lengthComp).forEach(System.out::println);
            // do the sort only on lenghComp basis
            
            //stream.sorted(lengthComp.thenComparing(String::compareTo));
            // the same as
            stream.sorted(lengthComp.thenComparing((x,y) -> (x.compareTo(y)))).forEach(System.out::println);;
            // thenComparing is a second method applied to Comparator: do the sort also with string
        }
    }

