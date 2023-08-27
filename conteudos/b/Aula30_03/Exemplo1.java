package b.Aula30_03;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String args []){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        double base = entrada.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = entrada.nextDouble();
        
        double area = (base * altura)/2;
        System.out.println("Área do triângulo:" + area);
    }
}
