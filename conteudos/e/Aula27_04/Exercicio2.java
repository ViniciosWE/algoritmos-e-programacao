
package e.Aula27_04;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número de 3 dígitos: ");
        int numero = entrada.nextInt();
        if(numero >= 100 && numero <= 999){
            int numero1 = numero / 100;
            int numero2 = (numero % 100) / 10;
            int numero3 = (numero % 100) % 10;
            
            int total = numero1 + numero2 + numero3;
            System.out.println("total = " + total);
        }
        else{
            System.out.println("O número deve conter 3 dígitos");
        }
}
}
