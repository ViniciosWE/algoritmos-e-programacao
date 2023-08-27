
package c.Aula13_04;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String angs[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        
        if(numero % 5 == 0){
            System.out.println("O número é múltiplo de 5");   
        }
        else{
            System.out.println("O número não é múltiplo de 5");
        }
    }
}
