/* Uma loja está oferecendo desconto em suas mercadorias. Quando o valor da compra 
é maior ou igual a R$ 100,00, o cliente ganha um desconto de 10%. Caso contrário, 
não há desconto. Escreva uma classe em Java para ler o valor da compra de 5 clientes. 
O programa deve calcular e mostrar:
• O valor total a ser pago por cada cliente, com o desconto aplicado (se houver).
• O valor total das compras de todos os clientes.
• O menor valor de compra entre todos os clientes. */
package m.Aula22_06;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double valor;
        double totalDaCompra = 0;
        double menorValor = 0;
        for (int i = 1; i <=5; i++) {
            System.out.println("CLIENTE " + i);
            System.out.print("Valor da compra: ");
            valor = entrada.nextDouble();
            if(valor >= 100){
                valor -= (valor * 0.1); 
            }
            System.out.println("Total a pagar: R$" + valor);
            totalDaCompra += valor; 
            if(i == 1){
                menorValor = valor;
            }
            else{
                if(menorValor > valor){
                    menorValor = valor;
                }
            }
        } 
        System.out.println("O total de todas as compra é: " + totalDaCompra);
        System.out.println("O menor valor das compras é: " + menorValor); 
    }
}