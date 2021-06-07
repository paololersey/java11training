package questions;

public class DoubleQuestion {
 
    
    public static void execute() {
        String s ="";
        if(Double.parseDouble("11.00f")> 11){
            //false
            s += 1;
        }
        if(1_7 == Integer.valueOf("17")){
            // true: 1_7 è 17
            s += 2;
        }
        if(1024>1023L){
            //true
            s+= 3;
        }
        System.out.println(s);
    }
}
