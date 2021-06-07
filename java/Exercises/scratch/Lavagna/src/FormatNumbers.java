import java.text.NumberFormat;

public class FormatNumbers {
    public static void main(String [] args) {
        var nf = NumberFormat.getIntegerInstance();
        String format1 = nf.format(-1.5);
        String format2 = nf.format(-2.5);
        System.out.println(format1.equals(format2));
    }
}
