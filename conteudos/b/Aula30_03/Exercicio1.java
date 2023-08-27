
package b.Aula30_03;

import java.util.Scanner;


public class Exercicio1 {
    public static void main(String args []){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a nota x ");
        double x = entrada.nextDouble();
        System.out.println("Digite a nota y ");
        double y = entrada.nextDouble();
        System.out.println("Digite a nota z ");
        double z = entrada.nextDouble();
        
        double media = (x + y + z)/3;
        System.out.println(" a média aritmética é: " + media );
    }
}

