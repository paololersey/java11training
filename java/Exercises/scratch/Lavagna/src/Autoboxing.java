public class Autoboxing {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        new Autoboxing().analyze(numbers);
    }

    public void analyze(Object[] o){
        System.out.println("I'm an object array");
    }
    public void analyze(Object o){
        System.out.println("I'm an object");
    }
    public void analyze(long[] l){
        System.out.println("I'm an array");
    }
}
