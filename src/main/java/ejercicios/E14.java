package ejercicios;

import java.util.Locale;
import static javax.swing.JOptionPane.*;

public class E14 {
    public static void main(String[] args) {
        int b, g;
        String apellido;
        String[] Genero = {"MASCULINO", "FEMENINO"};
        char primera_letra = 0;

        do {
            try {
                apellido = showInputDialog(null, "Ingrese su primer apellido", "Selección de Salón", INFORMATION_MESSAGE);

                if (apellido == null || apellido.isBlank()) {
                    throw new NullPointerException("El apellido no puede estar vacío.");
                }

                if (!apellido.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("El apellido no puede contener números ni caracteres especiales.");
                }

                primera_letra = apellido.toUpperCase(Locale.ROOT).charAt(0);
            } catch (NullPointerException | IllegalArgumentException e) {
                showMessageDialog(null, "Error: " + e.getMessage(), "Error", ERROR_MESSAGE);
            }

            g = showOptionDialog(null, "Escoja su género", "Selección de Salón",
                    DEFAULT_OPTION, INFORMATION_MESSAGE, null, Genero, Genero[0]);

            String grupo = (g == 0 && primera_letra > 'N') || (g == 1 && primera_letra < 'M') ? "A" : "B";
            showMessageDialog(null, "Usted se encuentra en el grupo " + grupo, "Selección de Salón", INFORMATION_MESSAGE);

            b = showConfirmDialog(null, "¿Desea volver a ejecutar el programa?", "Selección de Salón", YES_NO_OPTION);
        } while (b == 0);
    }
}
