package ejercicios;
import static javax.swing.JOptionPane.*;

public class E10 {
    public static void main(String[] args) {
        int b=0;
        int n1=0;
        do{

            try{
                n1=Integer.parseInt(showInputDialog(null,"Ingresar el número","Par o Impar",INFORMATION_MESSAGE));
            }catch (NumberFormatException e){
                showMessageDialog(null,"Se ha detectado un error \n"+e,"Error",ERROR_MESSAGE);
            }
                if((n1%2)==0){
                    showMessageDialog(null,"El número "+n1+" es par.","Par o Impar",INFORMATION_MESSAGE);
                }else{
                    showMessageDialog(null,"El número "+n1+" es impar.","Par o Impar",INFORMATION_MESSAGE);
                }

            b=showConfirmDialog(null,"¿Desea volver a ejecutar el programa?","Par o Impar",YES_NO_OPTION);
        }while(b==0);
    }
}
