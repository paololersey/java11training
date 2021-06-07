package interfaces;

class Car {
    void speed(Byte val) { //Line n1
        System.out.println("DARK"); //Line n2
    } //Line n3
 
    void speed(byte... vals) {
        System.out.println("LIGHT");
    }
}

public class InterfaceWithBytes {
    public static void main(String[] args) {
        byte b = 10; //Line n4
        new Car().speed(b); //Line n5
    }

    // `new Car().speed(b);` tags to speed(Byte) as boxing is preferred over variable arguments. Code as is prints DARK on to the console.
}
