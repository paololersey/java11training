import java.util.stream.Stream;

public class StreamCount {
    public static void main(String[] args) {
        Stream.of(true, false, true)
            .map(b -> b.toString().toUpperCase())
            .peek(System.out::println)
            .count();
    }

    // Prints nothing:
    // count() is a terminal method, which returns the count of elements in this stream.

    // If result of count() can directly be computed from the stream source, then the implementation may choose to not execute the stream pipeline.
    // map and peek not executed
}
