package ejercicios;

import static javax.swing.JOptionPane.*;

public class E16 {
    public static void main(String[] args) {
        int b=0,n1=0,n2=0,n3=0,i=0;
        String m1="",m2="",m3="";
        boolean primo = false;

        do {
            //Introducción de datos
            try {
                n1 = Integer.parseInt(showInputDialog(null, "Ingresar el primer número", "Datos", QUESTION_MESSAGE));
                if (n1 < 0) {
                    throw new IllegalArgumentException("No se admiten valores negativos");
                }
            } catch (IllegalArgumentException e) {
                showMessageDialog(null, "Error: " + e.getMessage(), "Error", ERROR_MESSAGE);
            }
            try {
                n2 = Integer.parseInt(showInputDialog(null, "Ingresar el segundo número", "Datos", QUESTION_MESSAGE));
                if (n2 < 0) {
                    throw new IllegalArgumentException("No se admiten valores negativos");
                }
            } catch (IllegalArgumentException e) {
                showMessageDialog(null, "Error: " + e.getMessage(), "Error", ERROR_MESSAGE);
            }
            try {
                n3 = Integer.parseInt(showInputDialog(null, "Ingresar el tercer número", "Datos", QUESTION_MESSAGE));
                if (n3 < 0) {
                    throw new IllegalArgumentException("No se admiten valores negativos");
                }
            } catch (IllegalArgumentException e) {
                showMessageDialog(null, "Error: " + e.getMessage(), "Error", ERROR_MESSAGE);
            }

            //Detección de números pares o impares
            if(n1%2==0){
                m1="El número "+n1+ " es par";
            }else{
                m1="El número "+n1+ " es impar";
            }
            if(n2%2==0){
                m2="El número "+n2+ " es par";
            }else{
                m2="El número "+n2+ " es impar";
            }
            if(n3%2==0){
                m3="El número "+n3+ " es par";
            }else{
                m3="El número "+n3+ " es impar";
            }

            //Detección de primos, según La criba de eratóstenes
            for(i=2;i<=Math.sqrt(n1);i++){
                primo=true;
                if((n1%i)==0){
                    primo=false;
                    break;
                }
            }

            if(primo == true){
                m1=m1+" y es primo";
            }else{
                m1=m1+" y no es primo";
            }

            for(i=2;i<=Math.sqrt(n2);i++){
                primo=true;
                if((n2 % i) == 0){
                    primo=false;
                    break;
                }
            }

            if(primo == true){
                m2=m2+" y es primo";
            }else{
                m2=m2+" y no es primo";
            }

            for(i=2;i<=Math.sqrt(n3);i++){
                primo=true;
                if((n3%i)==0){
                    primo=false;
                    break;
                }
            }

            if(primo == true){
                m3=m3+" y es primo";
            }else{
                m3=m3+" y no es primo";
            }

            showMessageDialog(null, "Resultados:\n" + m1 + "\n" + m2 + "\n" + m3);
            b = showConfirmDialog(null, "¿Desea volver a ejecutar el programa?", "División Aritmética", YES_NO_OPTION);
        }while (b == 0) ;
    }
}