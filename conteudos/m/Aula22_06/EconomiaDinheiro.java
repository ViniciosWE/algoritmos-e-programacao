/* Suponha que uma pessoa esteja economizando dinheiro para comprar um produto 
que custa R$1000. A pessoa consegue economizar R$100 por mês, mas o preço do produto 
diminui R$50 a cada mês. Escreva uma classe em Java que determine quantos meses 
são necessários para a pessoa conseguir comprar o produto.*/
package m.Aula22_06;

import java.util.Scanner;

public class EconomiaDinheiro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int preco = 1000;
        int econ = 0;
        int meses = 0;
        while (econ < preco){
            econ += 100;
            preco -= 50;
            meses++;
        }
        System.out.println("São necessário " + meses + " meses");
    }
}
