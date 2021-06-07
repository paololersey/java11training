package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfEmpty {
    
   
    public static void execute() {

        // 1
        try {
            List<Integer> even = List.of();
            even.set(0,-1);
            even.add(0,-2);
            even.add(0,-3);
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage()); 
            System.out.println("expected: only read operation allowed; go on");
        }
       
        // 2 
        List<Integer> even = new ArrayList<>(List.of());
            even.add(0,-1);
            even.set(0,-2);
            even.add(0,-3);
            System.out.println(even.size());

         // 3
         try {
         Integer[] intArray = new Integer[2];
         List<Integer> arrayIntegers = Arrays.asList(intArray);
         arrayIntegers.set(0,-1);
         System.out.println(arrayIntegers.size());
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage()); 
            System.out.println("expected: only read and update operation allowed; ");
        }
    }

}
