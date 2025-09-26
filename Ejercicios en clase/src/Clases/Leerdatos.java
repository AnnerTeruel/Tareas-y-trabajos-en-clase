package Clases;
import java.util.Scanner;

public class Leerdatos {
    public static void x(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int num1 =sc.nextInt();
        System.out.print("Numero 2: ");
        float num2 =sc.nextFloat();
        System.out.print("Texto: ");
        String texto = sc.next();
        
        System.out.println("Entero, "+num1+", Decimal, "+num2+", Texto, "+texto);
    }
}
