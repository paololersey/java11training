import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DropWhile {
    public static void main(String[] args) {
        String str = Stream.of("a", "an", "and", "alas", "after")
            .dropWhile(s -> s.length() > 2)
            .collect(Collectors.joining(", "));
        System.out.println(str);
        // butta via finche' la condizione è soddisfatta
        // qui esce subito - result: "a", "an", "and", "alas", "after"
    }

}
