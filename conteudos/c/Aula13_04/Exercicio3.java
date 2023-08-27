
package c.Aula13_04;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String angs[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de gols do primeiro time: ");
        int time1 = entrada.nextInt();
        System.out.println("Digite o número de gols do segundo time: ");
        int time2 = entrada.nextInt();
        
        if(time1 > time2){
            System.out.println("O primeiro time ganhou o jogo"); 
        }
        if(time1 < time2){
            System.out.println("O segundo time ganhou o jogo"); 
        }
        if(time1 == time2){
            System.out.println("O jogo de empate"); 
        }
    }
}
