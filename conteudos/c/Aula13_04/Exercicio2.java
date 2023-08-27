
package c.Aula13_04;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String angs[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero1 = entrada.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int numero2 = entrada.nextInt();
        
        if(numero1 == numero2){
            System.out.println("Os números são iguais");
        }
        else{
            System.out.println("Os números são diferentes");
        }
    }
}
