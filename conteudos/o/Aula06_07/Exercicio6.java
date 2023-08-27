
package o.Aula06_07;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean m = false;
        int par = 0;
        int impar = 0;
        while (!m) {
            System.out.print("Digite um número inteiro: ");
            int num = entrada.nextInt();
            if (num > 1000){
                m = true;
            } else {
                if (num % 2 == 0){
                    par++;
                } else {
                    impar+=num;
                }
            }

        }
        System.out.println("Foram digitados " + par + " pares");
        System.out.println("A soma dos números ímpares é " + impar);
    }
}
