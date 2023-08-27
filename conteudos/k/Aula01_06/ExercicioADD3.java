
package k.Aula01_06;

import java.util.Scanner;

public class ExercicioADD3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        int resolucao = 1;
        int somaDivisoresNum1 = 0;
        int somaDivisoresNum2 = 0;

        while (resolucao < num1 && resolucao < num2) {
            if (num1 % resolucao == 0) {
                somaDivisoresNum1 += resolucao;
            }
            if (num2 % resolucao == 0) {
                somaDivisoresNum2 += resolucao;
            }
            resolucao++;
        }

        if (somaDivisoresNum1 == num2 && somaDivisoresNum2 == num1) {
            System.out.println("Os números são amigáveis.");
        } else {
            System.out.println("Os números não são amigáveis.");
        }
    }
}
