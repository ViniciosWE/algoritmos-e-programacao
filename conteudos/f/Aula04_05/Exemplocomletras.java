
package f.Aula04_05;

import java.util.Scanner;

public class Exemplocomletras {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Qual o valor da sua compra: ");
        double valor = entrada.nextDouble();
        System.out.print("As formas de pagamento são \n D - Em dinheiro \n CD – Cartão Débito \n CC – Cartão Crédito \n qual a forma de pagamento você desejá: ");
        String op = entrada.next();
        double total = 0;
        switch(op){
            case "d":
            case "D":
                total = valor - (valor * 0.3);
                break;
            case "cd":    
            case "CD":
                total = valor - (valor * 0.25);
                break;
            case "cc":
            case "CC":
                total = valor - (valor * 0.2);
                break;
            default:
                break;
        } 
        if(total == 0){
            System.out.println("A compra não pode ser realizada");
        }
        else{
            System.out.println("O valor a ser pago é: "  + "R$" + total);
        }
    }
}
 

