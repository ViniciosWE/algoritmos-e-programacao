
package b.Aula30_03;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira segundos transcorridos: ");
        int mimTrans = entrada.nextInt();
        int horas = mimTrans / 60;
        int minutos = mimTrans % 60;
        
        System.out.println("O tempo transcorrido foi: " + horas + " Horas " + minutos + " minutos ");
    }
}
