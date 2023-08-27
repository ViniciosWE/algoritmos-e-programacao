
package k.Aula01_06;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        int contador = 1;
        double soma = 0;
        
        
        while (contador <= 4) {
            System.out.print("Digite o número " + contador + ": ");
            numero = entrada.nextDouble();
            if(numero >= 0 && numero <=10){
                soma += numero;
                contador++;
            }
            else{
                System.out.println("Valor invalido!!!");
            }
        }
        /*
            for (int contador = 0; contador < 4; contador++) {
                System.out.print("Digite o número " + contador + ": ");
                numero = entrada.nextDouble();
                if(numero >= 0 && numero <=10){
                    soma += numero;
                }
                else{
                    System.out.println("Valor invalido!!!");
                }
            }
        */
        double media = soma / 4;
        System.out.println("A média dos números digitados é: " + media);
    }
}
