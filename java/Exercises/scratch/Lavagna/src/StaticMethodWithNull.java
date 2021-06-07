// TRICKY - no NullPoiter
public class StaticMethodWithNull {
    public static void print() {
        System.out.println("STATIC METHOD!!!");
    }
    
    public static void main(String[] args) {
        StaticMethodWithNull obj = null; //Line n1
        obj.print(); //Line n2
    }
}
