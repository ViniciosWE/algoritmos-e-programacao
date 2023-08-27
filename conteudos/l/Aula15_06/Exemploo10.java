
package l.Aula15_06;

import java.util.Scanner;

public class Exemploo10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Texto: ");
        String texto = entrada.nextLine();
        String primChar = texto.substring(5);
        System.out.println("texto parcial: " + primChar);
    }
}
