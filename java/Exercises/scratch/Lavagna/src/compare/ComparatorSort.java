package compare;

import java.util.*;

public class ComparatorSort {
    // Comparator implements compare(object, object)
    public static void main(String[] args){
        String[] towns = {"boston","paris", "bangkok","oman"};
        Comparator<String> ms = (a,b) -> b.compareTo(a);
        Arrays.sort(towns,ms);
        System.out.println(Arrays.binarySearch(towns, "oman", ms));
    }
}
