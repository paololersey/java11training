public class ArrayAddNewElements {
    public static void main(String[] args) {
        String[] arr = { "A", "B", "C", "D" }; // Line n1
        arr[0] = arr[1]; // Line n2
        arr[1] = "E"; // Line n3

        for (String s : arr) {
            System.out.print(s + " ");
        }
        // BECD
    }
    
}
