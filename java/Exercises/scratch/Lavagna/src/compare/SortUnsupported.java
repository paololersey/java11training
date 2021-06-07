package compare;

import java.util.*;

public class SortUnsupported {
    // Comparator implements compare(object, object)
    public static void main(String[] args){
        List<String> list1 = List.of("plane","car","truck");
        List<String> list2 = new ArrayList<>(List.copyOf(list1));
        
        list1.sort((String item1, String item2) -> item1.compareTo(item2)); 
        list2.sort((String item1, String item2) -> item1.compareTo(item2));
        System.out.println(list2.equals(list2));
        // List.of no possible to compare
        
    }
}
