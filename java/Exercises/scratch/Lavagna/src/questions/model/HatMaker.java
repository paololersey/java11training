package questions.model;

public class HatMaker {
 
    private static int nextHat;
    private  int hatId;

    public static void toHat (Clothing cloth) {
        // hatId = nextHat; // Cannot make a static reference to the non-static field hatId
        cloth.getDescription(); // OK
        nextHat ++;
    }

   
}
