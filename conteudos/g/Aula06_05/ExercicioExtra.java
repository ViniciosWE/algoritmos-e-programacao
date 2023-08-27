
package g.Aula06_05;

import java.util.Scanner;

public class ExercicioExtra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nDigite um lado do triãngulo: ");
        double lado1 = entrada.nextDouble();
        System.out.println("Digite um lado do triãngulo: ");
        double lado2 = entrada.nextDouble();
        System.out.println("Digite um lado do triãngulo: ");
        double lado3 = entrada.nextDouble();

        if(lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)){
            System.out.print("É um triângulo: ");
            if(lado1 == lado2 && lado2 == lado3){
               System.out.print("Equilátero"); 
            }
            else{
                if(lado1 != lado2 && lado2 != lado3){
                    System.out.print("Escaleno"); 
                }
                else{
                    System.out.print("Isósceles"); 
                }
            }
        }
        else{
            System.out.print("Não é um triângulo");
        }
    }
}