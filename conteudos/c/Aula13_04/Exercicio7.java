
package c.Aula13_04;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String angs[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        
        if(numero > 0){
            System.out.println("O número é positivo"); 
        }
        if(numero < 0){
            System.out.println("O número é negativo"); 
        }
        if(numero == 0){
            System.out.println("O número e igual a zero"); 
        }
    }
}
