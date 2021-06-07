import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAddRemove {
    public static void main(String[] args) {
        Deque<Character> chars = new ArrayDeque<>();
        chars.add('A'); // means addLast
        chars.add('B');
        chars.remove(); // means removeFirst
        chars.add('C');
        chars.remove();
 
        System.out.println(chars); // C
    }
}
