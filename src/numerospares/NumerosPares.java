/*
1. Leer un número y mostrar por la salida estándar si dicho número es 
o no es par.
 */
package numerospares;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class NumerosPares {

    /**
     * @param args the command line arguments
     */
    public static int resultado;
    public static int num_uno;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            num_uno = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));

            if (num_uno != 0) {
                if ((num_uno % 2) == 0) {
                    JOptionPane.showMessageDialog(null, "El numero " + num_uno + " Es un numero PAR");
                } else {
                    JOptionPane.showMessageDialog(null, "El numero " + num_uno + " Es un numero IMPAR");

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifica el valor que ingresaste");
        }

    }

}
