
package k.Aula01_06;

import java.util.Scanner;

public class Exercicio5 {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.println("digite o valor da base(valor da base deve ser maior ou igual a 2): ");
         int base = entrada.nextInt();
          System.out.println("digite o valor do expoente( valor do expoente deve ser maior que 1): ");
         int expoente = entrada.nextInt();
         
         if(base >= 2 && expoente > 1){
             int inicioEresultado = 1;
             int contador = 0;
             
             while(contador < expoente){
                inicioEresultado *= base;
                contador++;
             }
             System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + inicioEresultado);
         }
         else
             System.out.println("Valor invalido");
    }
}
