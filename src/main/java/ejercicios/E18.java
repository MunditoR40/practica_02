package ejercicios;

import static javax.swing.JOptionPane.*;

public class E18 {
    public static void main(String[] args) {
        int b;
        double rentaAnual = 0;
        double tipoImpositivo = 0;

        do {
            try {
                String input = showInputDialog(null, "Ingrese su renta anual (en soles):", "Declaración de la Renta", INFORMATION_MESSAGE);
                rentaAnual = Double.parseDouble(input);

                if (input.isBlank()) {
                    throw new NullPointerException("El valor ingresado no puede estar vacío.");
                }

                if (rentaAnual < 0) {
                    throw new IllegalArgumentException("La renta anual debe ser mayor o igual a cero.");
                }

                if (rentaAnual < 10000) {
                    tipoImpositivo = 5;
                } else if (rentaAnual < 20000) {
                    tipoImpositivo = 15;
                } else if (rentaAnual < 35000) {
                    tipoImpositivo = 20;
                } else if (rentaAnual < 60000) {
                    tipoImpositivo = 30;
                } else {
                    tipoImpositivo = 45;
                }

                showMessageDialog(null, "Para una renta anual de S/ " + rentaAnual + ", el tipo impositivo es " + tipoImpositivo + "%.", "Resultado", INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                showMessageDialog(null, "Error: Ingrese un valor numérico válido.", "Error", ERROR_MESSAGE);
            } catch (IllegalArgumentException | NullPointerException e) {
                showMessageDialog(null, "Error: " + e.getMessage(), "Error", ERROR_MESSAGE);
            }

            b = showConfirmDialog(null, "¿Desea calcular otro tipo impositivo?", "Continuar", YES_NO_OPTION);

        } while (b == 0);
    }
}
