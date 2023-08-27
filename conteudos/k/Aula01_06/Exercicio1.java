
package k.Aula01_06;

import java.util.Scanner;

public class Exercicio1 {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();
        
        int soma = 0;
        int i = 1;
        while (i <= num) {
            soma += i;
            i++;
        }
        /*
            for (int i = 0; i < 10; i++) {  
                soma += 1;
            }  
        */
        System.out.println("A soma de todos os números entre 1 e " + num + " é: " + soma);
    }
}
