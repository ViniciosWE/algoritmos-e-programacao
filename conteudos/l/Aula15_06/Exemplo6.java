
package l.Aula15_06;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Texto: ");
        String texto = entrada.nextLine();
        texto = texto.replace("a", "A");
        System.out.println("texto: " + texto);
    }
}