/* Um supermercado está fazendo uma promoção de refrigerantes. Quando a quantidade 
de garrafas de refrigerante que o cliente deseja comprar corresponde a um número 
múltiplo de 6, o preço de cada garrafa de refrigerante é R$ 10,00. Caso contrário, 
o preço de cada garrafa é R$ 12,00. Escreva uma classe em Java para ler a quantidade 
de garrafas de refrigerante adquiridas por 5 clientes. A classe deve calcular e mostrar:
• O valor total a ser pago por cada cliente;
• A quantidade total de garrafas de refrigerante vendidas;
• A maior quantidade de garrafas vendida para um único cliente; */
package m.Aula22_06;

import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalGarrafas = 0;
        int maior = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("CLIENTE " + i);
            System.out.print("Quant. garrafas refri: ");
            int garrafas = entrada.nextInt();
            int fardos = garrafas / 6;
            int resto = garrafas % 6;
            int totalPagar = (fardos * 60) + (resto * 12);
            System.out.println("Total a pagar: " + totalPagar);
            totalGarrafas = totalGarrafas + garrafas;
            if (i == 1)
                maior = garrafas;
            else
                if (garrafas > maior)
                    maior = garrafas;
        }
        System.out.println("Total de garrafas vendidas: " + totalGarrafas);
        System.out.println("Maior quant. garrafas: " + maior);
    }
}
