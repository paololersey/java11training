public class Substring {
    public static void main(String[] args) {
        String s = "this is it";
        int x = s.indexOf("is"); // 2
        s = s.substring(1,x+3);
        x = s.indexOf("is"); // is it
        System.out.println(s+ "" + x);
    }
}
