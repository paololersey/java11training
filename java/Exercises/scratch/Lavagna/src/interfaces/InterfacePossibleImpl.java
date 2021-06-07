package interfaces;

public class InterfacePossibleImpl {

    public static void main(String[] args) {

    }

    public interface Interface {
        void showFirst();
    }

    /*
     * public class MainClass1 implements InterfacePossibleImpl{ public void
     * showFirst(); }
     */
    public abstract class MainClass1 implements Interface {
        public abstract void showFirst();
    }

    public abstract class MainClass2 implements Interface {
        public abstract void showFirst();
    }

    public abstract class MainClass3 implements Interface {
        public void showFirst() {
            System.out.println("ciao");
        }
    }

    public class MainClass4 implements Interface {
        public void showFirst() {
            System.out.println("ciao");
        }

    }
}
