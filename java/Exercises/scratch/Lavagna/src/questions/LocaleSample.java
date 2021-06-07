package questions;

import java.util.Locale;


public class LocaleSample {

    public void displayLocale(){
        var loc = java.util.Locale.ENGLISH;
        loc = Locale.getDefault();
        loc.getCountry();
        System.out.println("country = " + loc.getCountry() + ", language = " + loc.getLanguage());
    }
    
    
    
}
