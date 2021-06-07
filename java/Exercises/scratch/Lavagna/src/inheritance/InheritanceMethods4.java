package inheritance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InheritanceMethods4 {

    static class ConSuper {
        ConSuper(){
            this(2);
            System.out.print("3");
        }
        ConSuper(int x){
            System.out.print(x);
        }
    }

    static class ConSub extends ConSuper {
        ConSub(){
            this(4);
            System.out.print("1");
        }
        ConSub(int x){
            System.out.print(x);
        }
    }
    public static void main(String[] args) {
      new ConSub(4);
    }

    // se il metodo è static vince la superclass
    // se è di instance vince la subclass
}
