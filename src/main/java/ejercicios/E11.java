package ejercicios;

import static javax.swing.JOptionPane.*;

public class E11 {
    public static void main(String[] args) {
        int b1=0;
        double a=0,b=0,c=0,det=0,x1=0,x2=0;

        do {
            try{
                a = Double.parseDouble(showInputDialog(null,"Ingresar el coeficiente del término cuadrático","Raíces de una ecuación cuadrática",INFORMATION_MESSAGE));
            } catch (NumberFormatException e) {
                showMessageDialog(null,"Se ha detectado un error \n"+e,"Error",ERROR_MESSAGE);
            }

            try{
                b = Double.parseDouble(showInputDialog(null,"Ingresar el coeficiente del término lineal","Raíces de una ecuación cuadrática",INFORMATION_MESSAGE));
            } catch (NumberFormatException e) {
                showMessageDialog(null,"Se ha detectado un error \n"+e,"Error",ERROR_MESSAGE);
            }

            try{
                c = Double.parseDouble(showInputDialog(null,"Ingresar el coeficiente del término indpendiente","Raíces de una ecuación cuadrática",INFORMATION_MESSAGE));
            } catch (NumberFormatException e) {
                showMessageDialog(null,"Se ha detectado un error \n"+e,"Error",ERROR_MESSAGE);
            }

            det=Math.pow(b,2)-4*a*c;

            x1=(-b+Math.sqrt(det))/2*a;
            x2=(-b-Math.sqrt(det))/2*a;

            showMessageDialog(null,"La discriminante de la ecuación es: "+det+"\n Las Raíces son "+x1+" y "+x2);

            b1 = showConfirmDialog(null, "¿Desea volver a ejecutar el programa?", "Raíces de una ecuación cuadrática", YES_NO_OPTION);
        }while(b1==0);
    }
}
