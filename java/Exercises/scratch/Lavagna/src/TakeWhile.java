import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeWhile {
    public static void main(String[] args) {
        String str = Stream.of("add", "and", "afff", "a", "after")
            .takeWhile(s -> s.length() > 2)
            .collect(Collectors.joining(", "));
        System.out.println(str);
        // add, and, afff
        // tieni finche' la condizione è soddisfatta
    }

}
