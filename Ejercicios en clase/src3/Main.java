import javax.swing.*;
import clases.Operaciones;
public class Main {

    public static int suma(int a, int b){
        return a+b;
    }
    public static int resta(int a, int b){
        return a-b;
    }
    public static int multiplicacion(int a, int b){
        return a*b;
    }
    public static int divisio(int a, int b){
        return a/b;
    }

    public static void mensaje(String menaje){
        System.out.println(menaje);
    }

    public static void main(String[] args) {
        System.out.println("Suma: "+ suma(1,2));
        System.out.println("Resta: "+ resta(5,2));
        System.out.println("Multiplicacion: "+ multiplicacion(3,2));
        System.out.println("Division: "+ divisio(6,2));

        mensaje("Hola como esta");

        Operaciones op=new Operaciones();
        op.mensaje("Hola este es mi mensaje");
    }
}
