
package i.Aula18_05;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        for(int i = 1; i <= 10; i++){
        System.out.println("Digite o " + i + "º valor: ");
        int numero = entrada.nextInt();
            if(numero % 2 == 0){
               System.out.println("PAR " + numero); 
               par++;
            }
            else{
                System.out.println("IMAPR " + numero);
                impar++;
            }
        }
        System.out.println("Números de valores pares: " + par);
        System.out.println("Números de valores pares: " + impar);
    }
}