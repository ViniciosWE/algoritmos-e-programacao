
package f.Aula04_05;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Qual o valor da sua compra: ");
        double valor = entrada.nextDouble();
        System.out.print("As formas de pagamento são \n 1 - Em dinheiro \n 2 – Cartão Débito \n 3 – Cartão Crédito \n qual a forma de pagamento você desejá: ");
        int op = entrada.nextInt();
        
        switch(op){
            case 1:
                double porcentagem1 = valor * 0.3;
                double total1 = valor - porcentagem1;
                System.out.println("O valor a ser pago é: " + "R$" + total1);
                break;
            case 2:
                double porcentagem2 = valor * 0.25;
                double total2 = valor - porcentagem2;
                System.out.println("O valor a ser pago é: " + "R$" + total2);
                break;
            case 3:
                double porcentagem3 = valor * 0.20;
                double total3 = valor - porcentagem3;
                System.out.println("O valor a ser pago é: "  + "R$" + total3);
                break;
            default:
                System.out.println("Digite apenas 1, 2, ou 3!!!");
                break;
        } 
    }
}
 

