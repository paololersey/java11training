
package questions;

import questions.model.Clothing;

public class CalculationWithLoops {
  
    static double total = 0;

    public static void execute(){

        Clothing item1 = new Clothing();
        item1.setPrice(1.0);
        Clothing item2 = new Clothing();
        item2.setPrice(2.0);
        Clothing[] cloths= {item1,item2};

        for(Clothing item: cloths){
            total = total + item.getPrice();
            System.out.println(total);
         }
    }

}
