import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        //ejercicio 1
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        if(num>10){
            System.out.println("El numero es mayor que 10");
        }

        //ejercicio 2
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }

        //ejercicio 3
        String name=JOptionPane.showInputDialog("Ingrese su nombre: ");
        if(name.equals("Leo Messi")){
            System.out.println("La palabra es correcta");
        }

        //ejercicio 4

        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        if(numero>0){
            System.out.println("El numero es positivo");

        } else if (numero==0) {
            System.out.println("El numero es 0");
        }else{
            System.out.println("El numero es negativo");
        }


    }
}