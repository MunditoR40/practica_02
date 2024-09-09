package ejercicios;

import java.time.LocalDateTime;
import static javax.swing.JOptionPane.*;

public class E1 {
    //Escribir un programa en JAVA que pida al usuario su nombre y luego lo salude
    public static void main(String[] args) {
        int b = 0;
        String Name = "";

        do{
            //Solicitar nombre
            Name = showInputDialog(null,"Ingresar su nombre completo","Programa de Saluditos 1.0",INFORMATION_MESSAGE);
            //Obtener Tiempo
            int time = LocalDateTime.now().getHour();

            if(Name.isBlank()){
                showMessageDialog(null,"No ha ingresado ningún nombre","Programa de Saluditos 1.0",ERROR_MESSAGE);
            }else{
                //Detectar si tiempo es de día o de noche
                if(time<=5){
                    showMessageDialog(null,"Buenas noches "+Name);
                }else{
                    showMessageDialog(null,"Buenos días "+Name);
                }
            }
            b=showConfirmDialog(null,"¿Desea repetir  la ejecución del programa?","Programa de Saludito 1.0",YES_NO_OPTION);
        }while(b==1);
    }
}
