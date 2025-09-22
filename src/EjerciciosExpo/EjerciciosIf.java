package EjerciciosExpo;

import javax.swing.*;

public class EjerciciosIf {
    //ejercicio 1
    public void paroimpar(){
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(numero%2==0){
            JOptionPane.showMessageDialog(null,"El numero es par");
        }else{
            JOptionPane.showMessageDialog(null,"El numero es impar");
        }
    }
    //ejercicio 2
    public void descuento(){
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre del producto");
        double precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        JOptionPane.showMessageDialog( null, "El subtotal es "+precio*cantidad);
        if(cantidad>100){
            JOptionPane.showMessageDialog( null, "Descuento: 5%");
            JOptionPane.showMessageDialog( null, "Nombre del producto: "+nombre);
            JOptionPane.showMessageDialog( null, "Total a pagar: "+((precio*cantidad) -(precio*cantidad*0.05)));
        }else{
            JOptionPane.showMessageDialog( null, "Descuento: 0%");
            JOptionPane.showMessageDialog( null, "Nombre del producto: "+nombre);
            JOptionPane.showMessageDialog( null, "Total a pagar: "+precio*cantidad);
        }
    }
    //ejercicio 3
    public void mayor2(){
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(numero>numero2){
            JOptionPane.showMessageDialog( null, numero+" es mayor que "+numero2);
        }else{
            JOptionPane.showMessageDialog( null, numero2+" es mayor que "+numero);

        }
    }
    //ejercicio 4
    public void mayor3(){
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        int numero3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        if(n1>numero2 && n1>numero3){
            JOptionPane.showMessageDialog(null, n1+" es mayor que "+numero2+" y "+numero3);
        }else if (numero2>numero3 && numero2>n1){
            JOptionPane.showMessageDialog(null, numero2+" es mayor que "+n1+" y "+numero3);
        }else{
            JOptionPane.showMessageDialog(null, numero3+" es mayor que "+n1+" y "+numero2);
        }
    }
    //ejercicio 5
    public void edad(){
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        if(edad<18){
            JOptionPane.showMessageDialog(null, "Eres menor de edad");
        }else if(edad>=18 && edad <=20){
            JOptionPane.showMessageDialog(null, "Eres mayor de edad");
        }else if(edad>=21 && edad <= 64){
            JOptionPane.showMessageDialog(null, "Tienes la mayoria de edad");
        }else if(edad>=65){
            JOptionPane.showMessageDialog(null, "Eres de la tercera edad");
        }
    }
    //ejercicio 6
    public void mate(){
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        JOptionPane.showMessageDialog(null, "Operaciones: suma(+), resta(-), multiplicacion(*), division(/)");
        String opcion=JOptionPane.showInputDialog("Ingrese la operacion a realizar");
        if("+".equals(opcion) || "suma".equals(opcion)){
            JOptionPane.showMessageDialog(null, "Resultado: "+(n1+numero2));
        }else if("-".equals(opcion) || "resta".equals(opcion)){
            JOptionPane.showMessageDialog(null, "Resultado: "+(n1-numero2));
        }else if("*".equals(opcion) || "multiplicacion".equals(opcion)){
            JOptionPane.showMessageDialog(null, "Resultado: "+(n1*numero2));
        }else if("/".equals(opcion) || "division".equals(opcion)){
            if(numero2==0){
                JOptionPane.showMessageDialog(null, "Error. No se puede dividir entre 0");
            }else{
                JOptionPane.showMessageDialog(null, "Resultado: "+(n1/numero2));
            }
        }else{
            JOptionPane.showMessageDialog(null, "Opcion invalida");
        }
    }
    //ejercicio 7
    public void dias(){
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 7"));
        if(n1==1){
            JOptionPane.showMessageDialog(null, "Es lunes");
        }else if(n1==2){
            JOptionPane.showMessageDialog(null, "Es Martes");
        }else if(n1==3){
            JOptionPane.showMessageDialog(null, "Es Miercoles");
        }else if(n1==4){
            JOptionPane.showMessageDialog(null, "Es Jueves");
        }else if(n1==5){
            JOptionPane.showMessageDialog(null, "Es Viernes");
        }else if(n1==6){
            JOptionPane.showMessageDialog(null, "Es Sabado");
        }else if(n1==7){
            JOptionPane.showMessageDialog(null, "Es Domingo");
        }else{
            JOptionPane.showMessageDialog(null, "Numero no valido ");
        }
    }
}
