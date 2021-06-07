package consumer;

import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Consumer consumer = System.out::print;
        Consumer consumer2 = msg -> System.out.println(msg);
        Consumer consumer3 = arg -> { System.out.print(arg); };
        //Consumer consumer4 = (String arg) -> { System.out.print(arg); };
        // Consumer consumer5 = var arg -> { System.out.print(msg); };
        // Consumer consumer6 = msg -> { return System.out.print(msg); }; -> no return value
        consumer.accept("Hello");
     }
}
