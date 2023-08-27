
package c.Aula13_04;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String angs[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int x = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int y = entrada.nextInt();
        
        System.out.println("Antes de inverter o valor de x: " + x + " " + "e o valor de y é: " + y);
        int x2 = x;
        x = y;
        y = x2;
        
        System.out.println("Depois de inverter o valor de x: " + x + " " + "e o valor de y é: " +  y);
    }
}
