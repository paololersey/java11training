package primitive;

public class FloatException {
    
    static float validate(String s) throws IllegalArgumentException {
        return Float.parseFloat(s);
    }

    static float validate(String s, float min, float max) throws IllegalArgumentException {
        Float f= Float.parseFloat(s);
        if(!Float.isFinite(f) | f< min || f>max){
            throw new IllegalArgumentException();
        }
        return f;
       
        
    }
    public static void main(String[] args) {
        FloatException.validate("Pippo",0, 1000);
    }
}
