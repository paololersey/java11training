import java.util.Optional;

public class OptionaNullPointer {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(null);
        System.out.println(optional);
        /*
        Optional<T> class has below method:
        public static <T> Optional<T> of(T value){...}
        It returns an Optional describing the given non-null value.
        If null argument is passed to of method, then NullPointerException is thrown at runtime.
        */
    }
}
