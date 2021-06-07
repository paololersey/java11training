package interfaces;
// HIGH 
interface Parent {
    default void earn() {
        System.out.println("Earning for the family");
    }
 
    static void plan() {
        planRetirement();
        planChildrenEducation();
    }
 
    private static void planChildrenEducation() {
        //valid codes
    }
 
    private static void planRetirement() {
        //valid codes
    }
 
    String toString();
}
 
interface Child extends Parent {
    void play();
}
 
public class FunctionalInterfaceImplementation {
    public static void main(String[] args) {
        Child child = () -> System.out.println("PLAYING CRICKET..."); //Line n1 -> this is the impl. of Child, which comes to be a funcional interface
        child.play(); //Line n2
    }
}