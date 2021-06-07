import java.io.FileNotFoundException;
 
// TRICKY - no NullPoiter
class X {
    class Y {
        private void m() {
            System.out.println("INNER");
        }
    }
    
    public void invokeInner() {
        var obj = new Y(); //Line n1
        obj.m(); //Line n2
    }
}
 
public class XYInnerClass {
    public static void main(String[] args) {
        new X().invokeInner();
    }
}
