package interfaces;

public class FunctionalInterfaces {

    @FunctionalInterface
    interface MyRunnable {
        public void call();
        public default void run(){} // default implementation admitted
    }

    @FunctionalInterface
    interface MyRunnable2 {
        public void call();
    }

 /* not allowed
    @FunctionalInterface
    interface MyRunnable2 {
        public void call();
        public void run();
    }


   @FunctionalInterface
    interface MyRunnable3 {
    }

    
    interface MyRunnable4 {
        @FunctionalInterface
        public void call();
    }*/
    
}
