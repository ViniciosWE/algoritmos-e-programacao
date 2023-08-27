
package d.Aula20_04;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        if(idade<16){
            System.out.print("Não pode nem votar e nem dirigir"); 
        }
        if(idade<=16 && idade<18){
            System.out.print("Pode votar, mas não pode dirigir");
        }
        if(idade>=18){
            System.out.print("Pode votar e pode dirigir");
        }     
    }
}
