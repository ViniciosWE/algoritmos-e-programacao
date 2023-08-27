
package i.Aula18_05;

import java.util.Scanner;

public class ExercicioADD1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int cont = 0;
        System.out.println("Digite um valor inteiro: ");
        int numero = entrada.nextInt();
        for (int i = 1; i < numero; i++) {
            if(numero > 1 && numero % i == 0){
                cont++;
            }   
        }
        if(cont >= 3){
            System.out.println("Não é primo");
        }
        else{
            System.out.println("É primo");
        }
    }
}
