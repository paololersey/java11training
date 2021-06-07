public class InheritanceVariables {

    static class A {
        int x = 42;
        int getValue(){
            return x;
        }
    }

    static class B extends A {
        int x = 17;
        int getValue(){
            return x+1;
        }
    }
    public static void main(String[] args) {
       A a = new A();
       A ab = new B();
       B b = new B();
       System.out.println(a.x);
       System.out.println(ab.x);
       System.out.println(b.x);
       // 42,42,17 
       System.out.println(a.getValue());
       System.out.println(ab.getValue());
       System.out.println(b.getValue());
       // 42,18,18

       // superclass wins for variables
       // subclass wins for methods
       // se ci sono 2 metodi con un parametro superclass o subclass, la subclass vince
    }
}
