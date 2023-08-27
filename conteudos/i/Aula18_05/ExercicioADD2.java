
package i.Aula18_05;

import java.util.Scanner;

public class ExercicioADD2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        int total = 1;
        for(int i = numero; 1 <= i ; i--){
            total *= i; 
        }
        System.out.println(total);
    }
}
