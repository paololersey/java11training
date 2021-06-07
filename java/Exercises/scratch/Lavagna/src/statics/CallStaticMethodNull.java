package statics;

public class CallStaticMethodNull {
    
    public static void greet(String... args) {
        System.out.println("Hello");
        for(String arg : args){
            System.err.println(arg);
        }
    }

    public static void main(String[] args) {

        CallStaticMethodNull main = null;
        main.greet();
    }

    
}
