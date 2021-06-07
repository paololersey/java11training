package inheritance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InheritanceMethods3 {

    static class A {
        static String greeting(){
            return "Good night";
        }
        static String name(){
            return "Harry";
        }
    }

    static class B extends A {
        static String greeting(){
            return "Good morning";
        }
        static String name(){
            return "Potter";
        }
    }
    public static void main(String[] args) {
       A ab = new B();
       System.out.println(ab.greeting() +" "+ ab.name());;
    }

    // se il metodo è static vince la superclass
    // se è di instance vince la subclass
}
