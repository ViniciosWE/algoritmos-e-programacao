
package k.Aula01_06;

import java.util.Scanner;

public class Exercicio3 {
 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int maior = 0;
        int menor = 0;

        while (contador < 10) {
            System.out.print("Digite o número " + contador + ": ");
            int numero = entrada.nextInt();
            if(contador == 0){
                maior = numero;
                menor = numero;
            }
            else{
                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }
            contador++;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
