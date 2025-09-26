package Clases;

import java.util.Scanner;

public class CondicionalIf {
    public static void condicionalif(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de x: ");
        int x = sc.nextInt();

        if(x%2==0){
            System.out.println("El valor de "+x+": Par");
        }else{
            System.out.println("El valor de "+x+": Impar");
        }
    }
    
}
