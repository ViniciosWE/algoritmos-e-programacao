
package k.Aula01_06;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double dinheiro = 500;
        double x;
        boolean continua = false;
        while(!continua){
            System.out.println("\n1 - Saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Saque");
            System.out.println("4 - Encerrar");
            System.out.print("O que você desejá fazer: ");
            int painel = entrada.nextInt();
            switch(painel){
                case 1: 
                    System.out.println("\nSeu saldo atual é:" + "R$" + dinheiro);
                    break;
                case 2 : 
                    System.out.print("\nQuando você deseja depositar: ");
                    x = entrada.nextDouble();
                    dinheiro += x;
                    System.out.println("\nDepósito realizado com sucesso!!!");
                    System.out.println("\nSeu saldo atual é:" + "R$" + dinheiro);
                    break;
                case 3:
                    System.out.print("\nQuando você deseja sacar: ");
                    x = entrada.nextDouble();
                    if(x <= dinheiro){
                        dinheiro -= x;
                        System.out.print("\nsaque realizado com sucesso!!!");
                        System.out.println("\nSeu saldo atual é:" + "R$" + dinheiro);
                    }
                    else{
                        System.out.println("\nvocê não tem esse valor para saque!!!");
                    }
                    break;
                case 4:
                    System.out.print("\nPainel encerrado!");
                    continua = true;
                    break;
                default:
                System.out.println("\nDigite apenas 1 ou 2 ou 3 ou 4!!!");
                break;    
                 
            }
        }  
    }
}
