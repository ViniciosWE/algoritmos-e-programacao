
package e.Aula27_04;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Distância em CM(centímetros): ");
        int distancia = entrada.nextInt();
         
        int km = distancia / 100000;
        int m = (distancia % 100000) / 100;
        int cm = (distancia % 100000)  % 100;
        
        System.out.println(km + "Km e " + m + "m e " + cm + "Cm" );
        
    }
}
