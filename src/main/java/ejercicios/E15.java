package ejercicios;

import java.math.BigInteger;

import static javax.swing.JOptionPane.*;

public class E15 {
    public static void main(String[] args) {
        int b,numero=0;
        do {
            try {
                String input = showInputDialog(null, "Ingrese un número entero para calcular su factorial:", "Cálculo de Factorial", INFORMATION_MESSAGE);
                numero = Integer.parseInt(input);

                if (input.isBlank()) {
                    throw new NullPointerException("El valor ingresado no puede estar vacío.");
                }

                if (numero < 0) {
                    throw new IllegalArgumentException("El número debe ser mayor o igual a cero.");
                }

                BigInteger factorial = BigInteger.ONE;
                for (int i = 1; i <= numero; i++) {
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }

                // Mostrar el resultado
                showMessageDialog(null, "El factorial de " + numero + " es " + factorial, "Resultado", INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                showMessageDialog(null, "Error: Ingrese un número entero válido.", "Error", ERROR_MESSAGE);
            } catch (IllegalArgumentException | NullPointerException e) {
                showMessageDialog(null, "Error: " + e.getMessage(), "Error", ERROR_MESSAGE);
            }

            b = showConfirmDialog(null, "¿Desea calcular otro factorial?", "Cálculo de Factorial", YES_NO_OPTION);

        } while (b == 0);
    }
}