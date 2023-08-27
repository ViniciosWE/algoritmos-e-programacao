
package i.Aula18_05;

import java.util.Scanner;

public class ExercicioADD3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = entrada.nextInt();
        double i;
        double resultado = 0;
        for (i = n; i >= 1; i--) {
            resultado += 1/i;
        }
        System.out.println("resultado" + resultado);
    }
}
