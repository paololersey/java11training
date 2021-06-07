package console;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class SystemIn {
    public static void main(String[] args) throws IOException{
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in ));
        try{
            System.out.print("Input:");
            String input = b.readLine();
            System.out.print("Echo:" + input);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        // prints "input" an waits
    }
    
}
