
package f.Aula04_05;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite o primeiro número: ");
        double x = entrada.nextDouble();
        System.out.print("Digite o primeiro número: ");
        double y = entrada.nextDouble();
        
        System.out.print("Para efetuar o calculo digite: \n 1 para soma \n 2 para subtração \n 3 para divisão \n 4 para multiplicação \n após a leitura qual calculo deseja fazer: ");
        int op = entrada.nextInt();
        
        switch(op){
            case 1:
                double resultado1 = x + y;
                System.out.println("O resultado do calculo é: " + resultado1);
                break;
            case 2:
                double resultado2 = x - y;
                System.out.println("O resultado do calculo é: " + resultado2);
                break;
            case 3:
                double resultado3 = x * y;
                System.out.println("O resultado do calculo é: " + resultado3);
                break;
            case 4:
                if(y == 0){
                    System.out.println("valor invalido!!!");
                }
                else{
                double resultado4 = x / y;
                System.out.println("O resultado do calculo é: " + resultado4);
                }
                break;
            default:
                System.out.println("Digite apenas 1, 2, 3 ou 4!!!");
                break;
        } 
    }
}
