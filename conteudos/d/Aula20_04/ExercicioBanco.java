
package d.Aula20_04;

import java.util.Scanner;

public class ExercicioBanco {
    public static void main(String angs[]){
        Scanner entrada = new Scanner(System.in);
        while(true){
        System.out.println("Qual o valor deseja sacar(múltiplo de 5):  ");
        int numero = entrada.nextInt();
        if(numero % 5 == 0){
            int nota1 = numero / 100; 
            int nota2 = (numero % 100) / 50;
            int nota3 = (numero % 100 % 50) / 20;
            int nota4 = (numero % 100 % 50 % 20) / 10; 
            int nota5 = (numero % 100 % 50 % 20 % 10) / 5;
            System.out.println(nota1 + " " + "nota de R$ 100");
            System.out.println(nota2 + " " + "nota de R$ 50");
            System.out.println(nota3 + " " + "nota de R$ 20");
            System.out.println(nota4 + " " + "nota de R$ 10");
            System.out.println(nota5 + " " + "nota de R$ 5");
        }
        else{
            System.out.println("Valor inválido!");
        }
            System.out.println("\n");
        } 
  }
}
