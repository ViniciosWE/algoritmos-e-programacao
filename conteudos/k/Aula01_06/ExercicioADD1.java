
package k.Aula01_06;

import java.util.Scanner;

public class ExercicioADD1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        
        int somaDivisores = 0;
        int i = 1;

        while (i < numero) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
            i++;
        }
        if (somaDivisores > numero) {
            System.out.println("O número digitado é excessivo.");
        } else {
            System.out.println("O número digitado não é excessivo.");
        }
    }
}
