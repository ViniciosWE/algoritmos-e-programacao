
package c.Aula13_04;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String angs[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("O número é par");
        }
        else{
            System.out.println("O número é ímpar");
        }
    }
}
