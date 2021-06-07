package streams;

import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
        // Stream.iterate(initial value, next value)
        Stream.iterate(0, n -> n + 1).limit(10).forEach(x -> System.out.println(x));
    }
}
