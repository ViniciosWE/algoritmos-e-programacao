
package f.Aula04_05;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inicio= 0;
        double dinheiro = 500;
        double x;
        while(inicio == 0){
            System.out.println("\n0 - Saldo");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Encerrar");
            System.out.print("O que você desejá fazer: ");
            int painel = entrada.nextInt();
            switch(painel){
                case 0: 
                    System.out.println("\nSeu saldo atual é:" + "R$" + dinheiro);
                    break;
                case 1 : 
                    System.out.print("\nQuando você deseja depositar: ");
                    x = entrada.nextDouble();
                    dinheiro += x;
                    System.out.println("\nDepósito realizado com sucesso!!!");
                    System.out.println("\nSeu saldo atual é:" + "R$" + dinheiro);
                    break;
                case 2:
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
                case 3:
                    inicio ++;
                    System.out.print("\nPainel encerrado!");
                    break;
                default:
                System.out.println("\nDigite apenas 0 ou ou 2 ou 3!!!");
                break;    
                 
            }
        }  
    }
}
