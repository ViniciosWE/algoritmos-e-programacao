
package l.Aula15_06;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.next();
        for (int i = 0; i < nome.length(); i++) {
            System.out.println(i +": " +  nome.charAt(i));
        }
    }
}
