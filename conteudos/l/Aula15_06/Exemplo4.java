
package l.Aula15_06;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Texto1: ");
        String texto1 = entrada.nextLine();
        String textoMaiusc = texto1.toUpperCase();
        System.out.println("Texto em maiúsculo" + textoMaiusc);
        System.out.println("Texto2: ");
        String texto2 = entrada.nextLine();
        String textoMinu = texto2.toLowerCase();
        System.out.println("Texto em maiúsculo" + textoMinu);
    }
}
