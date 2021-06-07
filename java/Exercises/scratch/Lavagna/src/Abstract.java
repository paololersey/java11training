public class Abstract {

   public static void main(String[] args) {
      System.out.println("Ciao");
   } 
   public abstract class Animal {
      protected abstract void walk();
   }
   public abstract class Human extends Animal{
      //public abstract void walk(); // OK 
      //private abstract void walk(); // KO private
      protected void walk(){} //// OK even  if with ; at end
      //void walk(){} // KO default reduce visibility
      //abstract void walk(); // KO default reduce visibility
   }

}