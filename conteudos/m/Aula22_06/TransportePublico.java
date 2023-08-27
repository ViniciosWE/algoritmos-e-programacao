/* Uma empresa de transporte público está fazendo uma promoção. Quando o cliente 
compra 10 passagens, ele paga apenas 9. Cada passagem custa R$ 5,00. Escreva uma 
classe em Java que leia a quantidade de passagens que 5 clientes desejam comprar, 
calcule e mostre:
• O valor total a ser pago por cada cliente;
• A quantidade total de passagens vendidas;
• A quantidade de clientes que ganharam desconto na compra de passagens;*/
package m.Aula22_06;

import java.util.Scanner;

public class TransportePublico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantPassagVendidas = 0;
        int clientesDesc = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("CLIENTE " + i);
            System.out.print("Quant. de passagens: ");
            int passagens = entrada.nextInt();
            if (passagens >= 10)
                clientesDesc++;
            int dezenas = passagens / 10;
            int resto = passagens % 10;
            int totalPagar = ((dezenas * 9) + resto) * 5;
            System.out.println("Total a pagar: " + totalPagar);
            quantPassagVendidas += passagens;
        }
        System.out.println("Total de passagens vendidas: " + quantPassagVendidas);
        System.out.println("Total de clientes que ganharam desconto: " + clientesDesc);
    }
}
