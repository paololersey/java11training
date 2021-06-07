package streams;

import java.util.List;

public class StreamParallel {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        int sum = numbers.stream().reduce(0, (n,m) -> (n+m));
        System.out.println(sum);
        // 15
        sum = numbers.parallelStream().reduce(0, (n,m) -> (n+m));
        System.out.println(sum);
        // 15

        sum = numbers.stream().filter(n -> n>1).parallel().reduce(0, (n,m) -> (n+m));
        System.out.println(sum);
        // 14



    }    
}
