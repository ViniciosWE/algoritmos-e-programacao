
package i.Aula18_05;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro de 1 a 10: ");
        int numero = entrada.nextInt();
        
        if(numero >= 1 && numero <= 10){
            System.out.println("tabuado do " + numero + ":");
            for(int i = 1; i <= 10; i++){
                int total = numero * i;
                System.out.println(numero + "X" + i + "=" + total);
            }    
        }
        else{
            System.out.println("Valor invalido o valor deve ser de 1 a 10!!!");
        }
    }
}

