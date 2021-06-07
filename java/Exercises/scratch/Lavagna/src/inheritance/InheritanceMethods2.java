package inheritance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InheritanceMethods2 {

    static abstract class Automobile {
        abstract void wheels();
    }

    static class Car extends Automobile {

        void wheels() {
            System.out.println(4 + "2"); 
        }
        
    }
    public static void main(String[] args) {
       Automobile a = new Car();
       a.wheels();
    }

    // superclass wins for variables
    // subclass wins for methods
    // se ci sono 2 metodi con un parametro superclass o subclass, la subclass vince
}
