package Ecuaciones;

import java.util.jar.JarException;
import javax.swing.*;
import java.lang.Math;

public class Caidalibre {
    

    public  void velocidadf(){
        double gra=9.8;
        double v=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad inicial: "));
        double t=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo: "));

        double vf=v+(gra*t);
        JOptionPane.showMessageDialog(null, "El velocidad final es: "+vf);

    }

    public  void pocicionf( ){
        double gra=9.8;
        double pi=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la posicion inicial"));
        double vi=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad inicial: "));
        double t=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo: "));
        double pf=pi+(vi*t)+(0.5*gra*(t*t));
        JOptionPane.showMessageDialog(null, "El posicion final es: "+pf);
        
    }
    
}
