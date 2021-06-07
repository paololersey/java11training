class Outer {
    class Inner {
        void m() {
            System.out.println("CHANGE IS GOOD");
        }
    }
}
 
 public class OuterInnerClasses_1 {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.m();
    }   
}
