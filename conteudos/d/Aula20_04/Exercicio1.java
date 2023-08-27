
package d.Aula20_04;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        if(idade>=18 && idade<=67){
            System.out.print("Você pode doar sangue");
        }
        else{
            System.out.print("Você não pode doar sangue");
        }
    }
}
