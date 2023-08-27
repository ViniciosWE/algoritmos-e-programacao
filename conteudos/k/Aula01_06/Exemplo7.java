
package k.Aula01_06;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resposta = 1;
        do{
            System.out.println("Nota 1: ");
            double nota1 = entrada.nextInt();
            System.out.println("Nota 2: ");
            double nota2 = entrada.nextInt();
            double media = (nota1 + nota2)/2;
            System.out.println("Média: " + media);
            System.out.println("Clacular outra média (1 - sim | 2 - Não)");
            resposta = entrada.nextInt();
        }while(resposta != 2);
    }
}
