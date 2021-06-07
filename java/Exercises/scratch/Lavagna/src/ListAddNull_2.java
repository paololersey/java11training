import java.util.ArrayList;
import java.util.List;

public class ListAddNull_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(100); // remove index 100: java.lang.IndexOutOfBoundsException:
        
        System.out.println(list);
    }
}
