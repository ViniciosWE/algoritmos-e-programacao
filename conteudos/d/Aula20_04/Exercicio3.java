
package d.Aula20_04;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite três numeros DIFERENTES seguindo a ordem a baixo!");
        System.out.print("\nDigite o primeiro número: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = entrada.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = entrada.nextInt();
        if(n1>=n2 && n1>=n3){
            System.out.println(n1 + " " + "é o maior");
        }
        if(n2>=n1 && n2>=n3){
            System.out.println(n2 + " " + "é o maior");
        }    
        if(n3>=n1 && n3>=n2){
            System.out.println(n3 + " " + "é o maior");
        }    
        if(n1<=n2 && n1<=n3){
            System.out.println(n1 + " " + "é o menor");
        }    
        if(n2<=n1 && n2<=n3){
            System.out.println(n2 + " " + "é o menor");
        }    
        if(n3<=n1 && n3<=n2){
            System.out.println(n3 + " " + "é o menor");
        }    
    }
}
