package ejercicios;

import static javax.swing.JOptionPane.*;

/*Escribir un programa donde el usuario pueda pedir usando un menú de opciones la
bebida que requiera, el programa debe solicitar si el usuario desea helada, al tiempo,
caliente, sin azúcar u otras alternativas que usted pueda plantear, por cada opción
debe tener un precio, el programa solicita la cantidad de bebidas y deberá mostrar el
precio a pagar. También deberá tener en cuenta si paga en efectivo, tarjeta o yape.*/

public class E12 {
    public static void main(String[] args) {;
        int b=0,g=0,e=0,t=0,c=0;
        double p=0;

        String[] gas = {"INCA-KOLA\nS/3.50","COCA-COLA\nS/3.50","FANTA\nS/3.00","SPRITE\nS/3.00"},estado={"HELADA\n+S/0.20","SIN HELAR\n+S/0.00"},tipo={"NORMAL\n+S/0.00","SIN AZUCAR\n+S/0.20"};

        do{
            g=showOptionDialog(null,
                    "Eliga la bebida que quiere ordenar",
                    "Bebidas",
                    DEFAULT_OPTION,INFORMATION_MESSAGE,null,
                    gas,gas[0]
            );
            e=showOptionDialog(null,
                    "Eliga el estado de la bebida",
                    "Bebidas",
                    DEFAULT_OPTION,INFORMATION_MESSAGE,null,
                    estado,estado[0]
            );
            t=showOptionDialog(null,
                    "Eliga el tipo de bebida.",
                    "Bebidas",
                    DEFAULT_OPTION,INFORMATION_MESSAGE,null,
                    tipo,tipo[0]
            );

            if(g==0 || g==1){
                p=p+3.50;
            }else if(g==2 || g==3){
                p=p+3.00;
            }
            if(e==0){
                p=p+0.20;
            }
            if(t==1){
                p=p+0.20;
            }

            showMessageDialog(null,"Su bebida es:\nGaseosa: "+gas[g]+"\nEstado: "+estado[e]+"\nTipo: "+tipo[t]+"\nPrecio Final: S/"+
                    String.format("%.2f",p),"Bebidas",INFORMATION_MESSAGE);

            b=showConfirmDialog(null,"¿Desea volver a ejecutar el programa?","Bebidas",YES_NO_OPTION);
        }while(b==0);

    }
}
