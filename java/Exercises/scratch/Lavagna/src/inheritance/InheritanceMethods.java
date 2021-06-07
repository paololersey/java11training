package inheritance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InheritanceMethods {

    static class A {
        void foo(Collection arg){
            System.out.println("Ciao");
        }
    }

    static class B extends A {
        void foo(Collection arg){
            System.out.println("Hello");
        }
        void foo(List<String> list){
            System.out.println("Hola");
        }
    }
    public static void main(String[] args) {
       A ab = new B();
       ab.foo(new ArrayList<>());
    }

    // superclass wins for variables
    // methods: 
    // 1) se stessa firma vince la subclass
    // 2) se viene passato un subclass argument, se la superclass ha il subclass argument vince
    // 3) ma se viene sempre passato un subclass argument, se la superclass ha il subclass argument ma anche la subclass ha il subclass argument, vince la subclass
    // 
    // se ci sono 2 metodi con un parametro superclass o subclass, la subclass vince
}
