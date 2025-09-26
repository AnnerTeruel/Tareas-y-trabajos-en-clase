package Clases;

import java.util.Scanner;

public class Condicionalswitch {
    public static void condicionalswitch(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu principal");
        System.out.println("1. Saludo");
        System.out.println("2. Firmes");
        System.out.println("3. Descanso");
        System.out.println("-1. Salir");
        System.out.print("Ingrese la opcion: ");
        int x = sc.nextInt();
        switch (x) {
            case 1:
            System.out.println("Buenos dias");
            break;
            case 2:
            System.out.println("Ponganse Firmes");
            break;
            case 3:
            System.out.println("Descansen");
            break;
            case -1:
            System.out.println("Adios tontos");
            break;
            default:
                System.out.println("Opcion invalida");
        }

        
    }
}
