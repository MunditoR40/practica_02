package ejercicios;

import java.awt.*;

import static javax.swing.JOptionPane.*;

public class E2 {
    public static void main(String[] args) {
        double b,h,p,a;
        int t;

        do {
            //Ingresar valores
            //Ingresar base
            b = Double.parseDouble(showInputDialog(null,"Ingrese la base del rectángulo","Calculadora de área y perimetro",INFORMATION_MESSAGE));
            //Ingresar altura
            h = Double.parseDouble(showInputDialog(null,"Ingrese la altura del rectángulo","Calculadora de área y perimetro",INFORMATION_MESSAGE));

            p=2*b+2*h;
            a=(b*h);
            showMessageDialog(null,"El perimetro del rectangulo es: "+p+"m"+"\n"+"El área del rectángulo es:"+a+"m²","Calculadora de área y perimetro",INFORMATION_MESSAGE);

            t = showConfirmDialog(null,"¿Desea repetir  la ejecución del programa?","Calculadora de área y perímetro",INFORMATION_MESSAGE);
        }while(t==0);
    }
}
