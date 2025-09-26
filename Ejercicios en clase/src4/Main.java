import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        
//        String nombre;
//        int n1;
//        int n2;
//        int n3;
////        n1 = 10;
////        n3 = 50;
////        n2 = 20;
//        int tabla;
//
//        n1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota 1:"));
//        n2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota 2:"));
//        n3= Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota 3:"));
//        nombre = "Lucas";
//        System.out.print("Hola " + nombre);
//        System.out.print("Nota 1: " + n1);
//        System.out.print("Nota 2: " + n2);
//        System.out.println("Nota 3: " + n3);
//        System.out.println("Nota final: " + (n1 + n2  + n3));
//
//
//        int a=5;
//
//
//        System.out.println("Tablas de multiplicacion");
//
//
//        tabla= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tabla que desa ver:"));
//        System.out.println("Tabla del "+tabla);
//
//        System.out.println("Tabla del "+tabla);
//









        String nombrep;
        double precio;
        int cantidad;

        nombrep=JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto: "));
        precio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto: "));

        System.out.println("Nombre del producto: "+nombrep);
        System.out.println("Cantidad del producto: "+cantidad);
        System.out.println("Precio del producto: "+precio);
        System.out.println("Total: "+cantidad*precio);
        System.out.println("Impuesto: "+(cantidad*precio*0.15));
        System.out.println("Total a pagar: "+(cantidad*precio+(cantidad*precio*0.15)));




    }
}