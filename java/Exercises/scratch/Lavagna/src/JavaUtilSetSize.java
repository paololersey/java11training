import java.util.Set;

public class JavaUtilSetSize {
    public static void main(String[] args) {
        Set<String> set = Set.of("A", "E", "I", "I", null, "O", "U");
        System.out.println(set.size());
        // Exception in thread "main" java.lang.IllegalArgumentException: duplicate element: I
        //throw NullPointerException - if an element is null or IllegalArgumentException - if the elements are duplicates


    }
}
