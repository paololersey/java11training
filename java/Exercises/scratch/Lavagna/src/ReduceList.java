import java.util.List;

public class ReduceList {
    public static void main(String[] args) {
        var s1 = List.of("A", "E", "I", "O", "U").stream()
            .reduce("_", String::concat); // _AEIOU
        var s2 = List.of("A", "E", "I", "O", "U").parallelStream()
            .reduce("_", String::concat);// _A_E_I_O_U  or "_AE_I_OU" or "_AEIOU". 
        System.out.println(s1.equals(s2)); // output no predicatble
    }

}
