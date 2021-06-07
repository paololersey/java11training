import java.util.ArrayList;

public class ListAddNull_1 {
    public static void main(String[] args) {
        var list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.remove(0) + ":" + list.remove(null));
        // result null:true
        // remove(int) returns the deleted member of the list. In this case `list.remove(0);` returns null as null was deleted from the 0th index. So, list is left with 2 elements: [null, null].
        // remove(Object) returns true if deletion was successful otherwise false. In this case `list.remove(null)` removes first null from the list and returns true and list is left with just one element: [null].
    }
}
