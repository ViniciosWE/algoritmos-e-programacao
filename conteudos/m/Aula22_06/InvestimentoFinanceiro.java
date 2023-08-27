/* Suponha que uma pessoa tenha investido uma quantia inicial em um fundo de 
investimento que rende uma taxa fixa de 2% ao mês. Escreva uma classe em Java que 
solicite que o usuário informe o valor investido e determine em quantos meses 
o valor do investimento será triplicado.*/
package m.Aula22_06;

import java.util.Scanner;

public class InvestimentoFinanceiro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor do investimento: ");        
        double valorInvest = entrada.nextDouble();
        double rendimentos = valorInvest;
        int meses = 0;
        while (rendimentos < (valorInvest * 3)){
            rendimentos = rendimentos + (rendimentos * 0.02);
            meses++;
            System.out.println(meses + "º mês: R$ " + rendimentos);
        }
        System.out.println("São necessários " + meses + " meses");
    }
}
