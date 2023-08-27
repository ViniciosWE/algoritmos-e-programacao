
package c.Aula13_04;

import java.util.Scanner;

public class Exemplo1eou {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    System.out.print ("Idade - usuário 1: ");
    int idadel = entrada.nextInt();
    System.out.print ("Idade - usuário 2: ");
    int idade2 = entrada.nextInt();
    int restol = idadel % 2; 
    int resto2 = idade2 % 2;
    if ((restol == 0) || (resto2 == 0)){ 
    double totalPg = 60 - (60* 0.3); 
    System.out.println("Total: R$ " + totalPg);
    }
    else{
    System.out.println("Total: R$ 60,00");
    }
  }
}
