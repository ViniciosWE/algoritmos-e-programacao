/* Um posto de combustíveis está fazendo uma promoção de aniversário. A cada 10 litros 
de combustível abastecidos, o cliente ganha R$ 5,00 de bônus para gastar na loja de 
conveniência do posto. Escreva uma classe em Java que solicite que o usuário informe 
a quantidade de combustível que abastecida por 5 clientes, calcule e mostre:
• O valor total de bônus a que cada cliente terá direito (se houver).
• O valor total de bônus fornecidos a todos os clientes.
• Quantos clientes não receberam bônus para gastar na loja de conveniência.*/
package m.Aula22_06;

import java.util.Scanner;

public class PostoCombustiveis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalBonus = 0;
        int quantClieSemBonus = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("CLIENTE " + i);
            System.out.print("Quantidade de combustível: ");
            int quantComb = entrada.nextInt();
            if (quantComb < 10)
                quantClieSemBonus++;
            int dezenas = quantComb/10;
            int bonus = dezenas * 5;
            System.out.println("Total em bônus: " + bonus);
            totalBonus += bonus;
        }
        System.out.println("Total em bônus fornecidos: " + totalBonus);
        System.out.println("Quant. clientes sem bônus: " + quantClieSemBonus);
    }
}
