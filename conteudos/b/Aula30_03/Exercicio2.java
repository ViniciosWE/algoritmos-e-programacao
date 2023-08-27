
package b.Aula30_03;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String angs[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual a distância total em (KM): ");
        double distanciaTotal = entrada.nextDouble();
        System.out.print("Quantidade de combustivel em (L): ");
        double quantidadeCombustivel = entrada.nextDouble();
        
        double consumoMedio =   distanciaTotal/quantidadeCombustivel;
        System.out.print("Consumo Médio: " + consumoMedio + " " + "km/l");
    }
}
