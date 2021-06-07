import java.util.stream.IntStream;

// MEDIUM -> sum=98
public class MapSumStream {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,3)
            .map(i -> i * i)
            .map(i -> i * i)
            .sum();
        System.out.println(sum);
    }
}