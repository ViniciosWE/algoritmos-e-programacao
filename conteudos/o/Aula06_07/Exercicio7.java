
package o.Aula06_07;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maiorAlt = 0;
        int menorAlt = 0;
        int menorIdade = 0;
        int maiorIdade = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a sua altura: ");
            int alt = entrada.nextInt();
            System.out.print("Digite a sua idade: ");
            int idade = entrada.nextInt();
            if (i == 0) {
                maiorAlt = alt;
                menorAlt = alt;
                maiorIdade = idade;
                menorIdade = idade;
                
            } else {
                maiorAlt = Math.max(maiorAlt, alt);
                menorAlt = Math.min(menorAlt, alt);
                maiorIdade = Math.max(maiorIdade, idade);
                menorIdade = Math.min(menorIdade, idade);
            }
        }
        System.out.println("A pessoa mais alta tem " + maiorAlt 
                + " centímetros, e a menor tem " + menorAlt + " centímetros");
        System.out.println("A pessoa mais velha tem " + maiorIdade 
                + " anos, e a mais nova tem " + menorIdade + " anos");
    }
}
