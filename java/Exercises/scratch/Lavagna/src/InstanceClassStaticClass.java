
class A {
    static class B {
        
    }
}
 
public class InstanceClassStaticClass {
    /*INSERT*/
    A.B obj = new A.B();
   // B obj = new B(); // wrong
  // A.B obj = new A().new B(); // wrong
    // B obj = new A.B(); // wrong

}