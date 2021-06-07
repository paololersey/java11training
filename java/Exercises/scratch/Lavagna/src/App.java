import java.util.Arrays;
import java.util.stream.Stream;

import questions.Calc;
import questions.CalculationWithLoops;
import questions.DoubleQuestion;
import questions.FutureWithCallable;
import questions.ListOfEmpty;
import questions.LocaleSample;
import questions.SupplierInteger;
import questions.model.Clothing;
import questions.model.Customer;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        FutureWithCallable.execute();
        DoubleQuestion.execute();
        ListOfEmpty.execute();
        Calc.execute();
        SupplierInteger.execute();

        mapAnyMatchTry();

        switchInt();   
        CalculationWithLoops.execute();
        LocaleSample localeSample = new LocaleSample();
        localeSample.displayLocale();
    

    }

    private static void switchInt() {
        Customer c1 = new Customer();
        int measurement = 5;
        switch(measurement){
            case 1: case 2: case 3: 
               c1.setSize("S"); 
               break;
            case 4: case 5: case 6:  
               c1.setSize("M"); 
               break;
            case 7: case 8: case 9:  
                c1.setSize("L");
                break;
            default:
                c1.setSize("X");
                break;

        }
        System.out.println("Customer " + Integer.valueOf(1) + " size = " + c1.getSize() +10 + 10/2);
        System.out.print(10 + 10/2 + " string");
    }

    private static void mapAnyMatchTry() {
        Clothing c1 = new Clothing();
        c1.setDescription("Shirt");
        Clothing c2 = new Clothing();
        c2.setDescription("Trousers");
        Clothing[] clothingArray = {c1,c2};
        Arrays.sort(clothingArray);
        Stream<Clothing> stream = Arrays.asList(clothingArray).stream();
        //stream.forEach(c -> System.out.println(c.getDescription()));
        boolean isShirtPresent = stream.map(c -> c.getDescription())
        .anyMatch(c -> c.equals("Shirt"));
        System.out.println("isShirtPresent="+isShirtPresent);
    }

    
}
