package questions;

import java.util.function.Supplier;

public class SupplierInteger {
    
    public static void execute() {
        final int i = 25;
        Supplier<Integer> foo = () -> i;
        //i++; -> KO
        System.out.println(foo.get());
    }
}
