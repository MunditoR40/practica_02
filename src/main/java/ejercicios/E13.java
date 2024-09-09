package ejercicios;

import static javax.swing.JOptionPane.*;

public class E13 {

    public static void main(String[] args) {
        int b=0;
        do{
            int edad=0;
            double salario=0;

            try{
                edad = Integer.parseInt(showInputDialog(null, "Ingrese su edad", "Tributación", INFORMATION_MESSAGE));
                if(edad<=0){
                    throw new NumberFormatException();
                }
            }catch (NumberFormatException e){
                showMessageDialog(null,"Se ha detectado un error \n"+e,"Error",ERROR_MESSAGE);
            }

            if(edad>=18){
                try{
                    salario = Integer.parseInt(showInputDialog(null, "Ingrese su salario mensual.", "Tributación", INFORMATION_MESSAGE));
                    if(salario<0){
                        throw new NumberFormatException();
                    }
                }catch (NumberFormatException e){
                    showMessageDialog(null,"Se ha detectado un error \n"+e,"Error",ERROR_MESSAGE);
                }
                if(salario>=1300){
                    showMessageDialog(null,"Usted tributa","Tributación",INFORMATION_MESSAGE);
                }else{
                    showMessageDialog(null,"Usted no tributa","Tributación",INFORMATION_MESSAGE);
                }

            }else{
                showMessageDialog(null,"Es menor de edad, usted no tributa","Tributación",INFORMATION_MESSAGE);
            }
            b=showConfirmDialog(null,"¿Desea volver a ejecutar el programa?","Tributación",YES_NO_OPTION);
        }while(b==0);
    }

}
