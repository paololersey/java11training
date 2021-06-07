package threads;

public class Runn {
    interface MyRunnable {
        int run(Double start, Double end);
    }
     
    class Runner implements MyRunnable {
        public int run(Double s, Double e) {
            if(s == null) s = 0.0;
            if(e == null) e = 0.0;
            return (int) (s + e);
        }
    }
     
    public static class Test {
        public static void startRunning(MyRunnable r) {
            System.out.println(r.run(5.8, null)); //Line n1
        }
        public static void main(String[] args) {
            startRunning((a, b) ->(int) (a + b)); // b is null, NullPointerException
        }
    }
}
