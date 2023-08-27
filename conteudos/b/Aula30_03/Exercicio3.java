
package b.Aula30_03;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual ano do seu nascimento: ");
        int nasc = entrada.nextInt();
        int ano = 2023;
        
        int idade = ano - nasc;
        System.out.println("Essa é sua idade: " + idade);
    }
}
