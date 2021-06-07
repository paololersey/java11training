package interfaces;
public class InterfaceWithFinalStaticVariableImplicit {
    
    public interface GetSetGo {
        int count = 1; //Line n1
    }
    public static void main(String[] args) {
        GetSetGo [] arr = new GetSetGo[5]; //Line n2
        for(GetSetGo obj : arr) {
           // obj.count++; //Line n3
        }
        System.out.println(GetSetGo.count); //Line n4
    }
    // as variable 'count' is implicitly final, therefore obj.count++ causes compilation error. Line n3 fails to compile.
}
