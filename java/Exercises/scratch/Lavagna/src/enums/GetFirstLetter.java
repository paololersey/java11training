package enums;

public class GetFirstLetter {
    
    public static void main(String[] args) {
        var a = Alphabet.A;
        System.out.println(a);
    }
    enum Alphabet {
        A,B,C;
        final String getFirstLetter(){
            return A.toString();
        }
    }
}
