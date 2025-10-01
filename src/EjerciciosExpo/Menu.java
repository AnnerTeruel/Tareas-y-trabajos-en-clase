package EjerciciosExpo;

import javax.swing.*;

public class Menu {
    public static void menup() throws InterruptedException {
        int op=0;
        while(op!=-1){
            System.out.println("Menu Principal\n1.Grupo 1\n2. Grupo 3\n-1. Para salir\n");
            op=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: "));
            switch (op){
                case 1:
                EjerciciosIf ej = new EjerciciosIf();
                System.out.println("Tarea grupo 1");
                int opc=0;
                while(opc!=8){

                    opc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ejercico a realizar (1-7, 8 para salir)"));
                    switch (opc) {
                        case 1:
                        System.out.println("Ejercicio 1");
                        ej.paroimpar();
                        break;
                        case 2:
                        System.out.println("Ejercicio 2");
                            ej.descuento();
                            break;
                        case 3:
                        System.out.println("Ejercicio 3");
                            ej.mayor2();
                            break;
                        case 4:
                        System.out.println("Ejercicio 4");
                            ej.mayor3();
                            break;
                        case 5:
                        System.out.println("Ejercicio 5");
                            ej.edad();
                            break;
                        case 6:
                        System.out.println("Ejercicio 6");
                            ej.mate();
                        break;
                        case 7:
                        System.out.println("Ejercicio 7");
                            ej.dias();
                            break;
                        case 8:
                            
                        System.out.println("Saliendo del ciclo");
                            break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                }
                    try {
                        // Pausa la ejecución por 5000 milisegundos (5 segundos)
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        // Manejar la interrupción si el hilo es despertado
                        // antes de que el tiempo de espera termine
                        Thread.currentThread().interrupt(); // Opcional: restablecer el estado de interrupción
                    }
                    break;

                    case 2:
                    EjeciciosCiclos ec= new EjeciciosCiclos();
                    System.out.println("Ejercicios grupo 3");
                    opc=0;
                    while(opc!=11){

                    opc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ejercico a realizar (1-10, 11 para salir)"));
                    switch (opc) {
                        case 1:
                        System.out.println("Ejercicio 1");
                            ec.ejercicio1();
                        break;
                        case 2:
                        System.out.println("Ejercicio 2");
                            ec.ejercicio2();
                            break;
                        case 3:
                        System.out.println("Ejercicio 3");
                            ec.ejercicio3();
                            break;
                        case 4:
                        System.out.println("Ejercicio 4");
                            ec.ejercicio4();
                            break;
                        case 5:
                        System.out.println("Ejercicio 5");
                            ec.ejercicio5();
                            break;
                        case 6:
                        System.out.println("Ejercicio 6");
                            ec.ejercicio6();
                            break;
                        case 7:
                        System.out.println("Ejercicio 7");
                            ec.ejercicio7();
                            break;
                        case 8:
                        System.out.println("Ejercicio 7");
                            ec.ejercicio8();
                            break;
                        case 9:
                        System.out.println("Ejercicio 7");
                            ec.ejercicio9();
                            break;
                        case 10:
                            ec.ejercicio10();
                            break;
                        case 11:
                        System.out.println("Saliendo de la opcion...");
                        break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                }
                    try {
                        // Pausa la ejecución por 5000 milisegundos (5 segundos)
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        // Manejar la interrupción si el hilo es despertado
                        // antes de que el tiempo de espera termine
                        Thread.currentThread().interrupt(); // Opcional: restablecer el estado de interrupción
                    }
                    break;
                case -1:
                    System.out.println("Salieno del programa...");
                    try {
                        // Pausa la ejecución por 5000 milisegundos (5 segundos)
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        // Manejar la interrupción si el hilo es despertado
                        // antes de que el tiempo de espera termine
                        Thread.currentThread().interrupt(); // Opcional: restablecer el estado de interrupción
                    }
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
                    try {
                        // Pausa la ejecución por 5000 milisegundos (5 segundos)
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        // Manejar la interrupción si el hilo es despertado
                        // antes de que el tiempo de espera termine
                        Thread.currentThread().interrupt(); // Opcional: restablecer el estado de interrupción
                    }
            }
        }
    }
}
