package functions;

public class LambdaMixVariables {

    interface Abacus {
        public int calc (int a, int b);
    }
    public static void main(String[] args) {
        int result = 0;
        Abacus aba = (int a, int b) -> a * b; // correct
        Abacus aba2 = (var a, var b) -> a * b; // correct
        Abacus aba3 = (a, b) -> a * b; // correct

        Abacus aba4 = (a, b) -> { return a * b; }; // correct
        // Abacus aba = (int a, b) -> a * b; // cannot mix variables
        // Abacus aba3 = (var a, b) -> a * b; // cannot mix variables
        result = aba.calc(10,20);
    }
}
