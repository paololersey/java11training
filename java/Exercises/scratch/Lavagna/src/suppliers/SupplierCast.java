package suppliers;

import java.util.function.Supplier;

public class SupplierCast {

    public static void main(String[] args) {
        int i = 25;
        // Supplier<Integer> foo = () -> i; // enclosing scope final
        i++;
       // System.out.println(foo.get());
    }

}
