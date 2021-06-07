package functions;

import java.util.function.Function;

public class FunctionTriple {
    public static void main(String[] args) {
        Function<Integer,Integer> tripler = x->  { return (Integer) x * 3 ; };
     }
    
}
