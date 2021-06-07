public class SystemOutPrintWithOperators {
    public static void main(String[] args) {
        //System.out.println("Equals??? " + 10 != 5); // Incompatible operand types String and int
        // System.out.println("Equals??? " + 10); // dà "Equals??? 10"
        System.out.println("Equals??? " + 10 != "S"); // -> true
    }
}
