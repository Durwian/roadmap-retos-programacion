import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Durwian {
    /*
     * Funciones definidas por el usuario
     */
    public static void main(String[] args) {

    holaSaluda();
    habla("Hola Java!", 2);

    }
   
    public static void holaSaluda(){
        System.out.println("Hola Java!");
    }

    public static String habla(String string, int numero){
        
        for (int i = 0; i < numero; i++) {
            System.out.println(string);
        }
    }
    public static String habla(String string){
        System.out.println(string);

    }
    public static ArrayList ferLlista(String[] strings){
        ArrayList llista = new ArrayList<String>();
        for (String string : strings) {
            llista.addLast(string);
            string.toUpperCase();
        }
        return llista;
    } 

    
