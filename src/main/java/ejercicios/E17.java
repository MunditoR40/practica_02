package ejercicios;

import static javax.swing.JOptionPane.*;

public class E17 {
    public static void main(String[] args) {
        int b;
        double lado1 = 0, lado2 = 0, lado3 = 0;

        do {
            try {
                lado1 = Double.parseDouble(showInputDialog(null, "Ingrese la longitud del primer lado:", "Entrada de Datos", INFORMATION_MESSAGE));
                lado2 = Double.parseDouble(showInputDialog(null, "Ingrese la longitud del segundo lado:", "Entrada de Datos", INFORMATION_MESSAGE));
                lado3 = Double.parseDouble(showInputDialog(null, "Ingrese la longitud del tercer lado:", "Entrada de Datos", INFORMATION_MESSAGE));

                if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
                    throw new IllegalArgumentException("Los lados deben ser mayores a 0.");
                }

                if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
                    throw new IllegalArgumentException("Las longitudes ingresadas no forman un triángulo válido.");
                }

                String tipoTriangulo;
                if (lado1 == lado2 && lado2 == lado3) {
                    tipoTriangulo = "Equilátero";
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    tipoTriangulo = "Isósceles";
                } else {
                    tipoTriangulo = "Escaleno";
                }

                showMessageDialog(null, "El triángulo es " + tipoTriangulo, "Resultado", INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                showMessageDialog(null, "Error: Ingrese valores numéricos válidos.", "Error", ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                showMessageDialog(null, "Error: " + e.getMessage(), "Error", ERROR_MESSAGE);
            }

            b = showConfirmDialog(null, "¿Desea probar con otras longitudes?", "Continuar", YES_NO_OPTION);

        } while (b == 0);
    }
}
