
package i.Aula18_05;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int acimaMedia = 0 , abaixoMedia = 0;
        for (int i = 1; i <= 5; i++) { 
            System.out.print ("Nota 1: ");
            double notal = entrada.nextDouble();
            System.out.print ("Nota 2: ");
            double nota2 = entrada.nextDouble();

            if(nota2 <=0 && nota2 >=10 &&  notal <=0 && notal >=10){
                System.out.println("valor invalido");
            }
            else{
                double media = (notal + nota2)/2;
                System.out.println("Média: " + media); 
                if(media >=7){
                    System.out.println("APROVADO");
                    acimaMedia++;
                }
                else{
                    System.out.println("RPROVADO");
                    abaixoMedia++;
                }
            }    
        }
        System.out.println("acima da média: " + acimaMedia);
        System.out.println("abaixo da média: " + abaixoMedia);
    }
}
