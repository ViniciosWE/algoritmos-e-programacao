
package c.Aula13_04;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String angs[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro menor que 1000 : ");
        int numero = entrada.nextInt();
        if(numero < 0){
            numero *= -1; //é o mesmo que "numero = numero * -1;"
        }
        if(numero >= 1000){
            System.out.println("Número invalido! Deve ser menor que 1000");
        }
        else{
        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;
        
        System.out.println("Centenas: " + centenas);
        System.out.println("Dezenas: " + dezenas);
        System.out.println("Unidades: " + unidades);
        }
    }
}
