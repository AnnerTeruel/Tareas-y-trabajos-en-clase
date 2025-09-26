package EjerciciosExpo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjeciciosCiclos {

    public void ejercicioClase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero= sc.nextInt();
        System.out.println("Tabla de multiplicar del "+numero+":");
        for (int i=1; i<=10;i++){
            System.out.println(numero+" x "+i+" = "+(numero*i));
        }
        
    }
    public void fizzbuzz(){
        for(int i=1;i<=100;i++)
        {
            if(i%15==0){
                System.out.println("Fizzbuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }
        }
    }
    public void promedio(){
        int notas;
        int suma=0;
        float promedio;
        for(int i=0;i<5;i++){
            notas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota "+(i+1)));
            suma+=notas;
        }
        promedio=suma/5;
        if(promedio<=70){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
        
    }

    public void paroimpar(){
        int par=0,impar=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("Pares: "+par);
        System.out.println("Impares: "+impar);
    }
    //ejerciciosTareaExpo
    public static void ejercicio1(){
        for(int i=1;i<=100;i++){
            System.out.println(i);
        }
    }
    public static void ejercicio2(){
        int suma=0;
        for(int i=1;i<=50;i++){
            suma+=i;
        }
        System.out.println(suma);

    }

    public static void ejercicio3(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        System.out.println("Tabla del "+num+": ");
        for(int i=1;i<=10;i++){
            System.out.println(i*num);
        }
    }

    public static void ejercicio4(){
        for(int i=1;i<=50;i++){
            System.out.println(i*2);
        }
    }

    public static void ejercicio5(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        int fac=1;
        for(int i=num;i>=1;i--){
            fac*=i;
        }
        System.out.println("Factorial: "+fac);
    }

    public static void ejercicio6(){
        int spar=0,simpar=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                spar+=i;
            }else{
                simpar+=i;
            }
        }
        System.out.println("Suma de pares: "+spar);
        System.out.println("Suma de impares: "+simpar);
    }

    public static void ejercicio7(){
        int contador=0;
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        for(int i=1;i<=100;i++){
            if(i%num==0){
                contador++;
            }
        }
        System.out.println("Cantidad de multiplos que hay: "+contador);
    }

    public static void ejercicio8(){
        String palabra=JOptionPane.showInputDialog("Ingrese una palabra: ");
        String pi="";
        for(int i=palabra.length()-1;i>=0;i--){
            pi+=palabra.charAt(i);
        }
        System.out.println("Palabra inversa: "+pi);
    }

    public static void ejercicio9(){
        //Primero se recorre del 2 al 100, ya que el 1 no es primo
        for(int i=2;i<=100;i++){
            
            boolean esPrimo=true;//para saber si es primo o no
            for (int j=2;j*j <=i ;j++){//esto es para saber si este numero es devisible desde 2 hasta el mismo
                if((i%j==0)){//si se puede dividir y no deja residuo no es primo
                    esPrimo=false;
                    break;
                }

            }
            //sino si es primo
            if(esPrimo){
                System.out.println(i+" es primo");
            }
        
        }

        
    }

    public static void ejercicio10(){
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
