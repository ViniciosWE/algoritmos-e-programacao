
package c.Aula13_04;

import java.util.Scanner;

public class Exemplo1ifelse {
    public static void main(String args[]) {
    Scanner entrada = new Scanner(System.in);
    System.out.print ("Nota 1: "); 
    double notal = entrada.nextDouble();
    System.out.print ("Nota 2: "); 
    double nota2 = entrada.nextDouble();
    double media = (notal + nota2) / 2;
    if (media >= 7) {
    System.out.println("\nAPROVADO");
    }
    if (media < 7) {
    System.out.println("\nREPROVADO");
    }
  }
}
