
package l.Aula15_06;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Texto: ");
        String texto = entrada.nextLine();
        String primChar = String.valueOf(texto.charAt(0));
        primChar = primChar.toUpperCase();
        System.out.println("primeiro caracter: " + primChar);
        String restoTexto = texto.substring(1);
        String novoTexto = primChar + restoTexto;
        System.out.println("Texto final:" + novoTexto);
    }
}
