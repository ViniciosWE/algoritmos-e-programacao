
package i.Aula18_05;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 0, menor = 0;
        double total = 0;
        for(int i = 1; i <= 10; i++){
        System.out.println(i +"º valor: ");
        int numero = entrada.nextInt();
            if(i == 1){
              maior = numero;
              menor = numero;
            }
            else{
               if(numero > maior){
                  maior = numero;
               }
               if(numero < menor){
                   menor = numero;
               }
            }
            total += numero;
        }
        System.out.println("maior número: " + maior);
        System.out.println("menor número: " + menor);
        System.out.println("média: " + (total/10));
    }
}

