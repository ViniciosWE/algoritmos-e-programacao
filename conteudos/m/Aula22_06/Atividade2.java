/* Suponha que uma pessoa queira resfriar um objeto. A taxa de resfriamento é de 
5 graus Celsius por minuto. Escreva uma classe em Java que solicite que o usuário informe 
a temperatura inicial do objeto e determine em quantos minutos o objeto atingirá 
uma temperatura inferior a 10 graus Celsius.*/
package m.Aula22_06;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a temperatura: ");
        int graus = entrada.nextInt();
        int i = 0;
         if(graus >= 10){
             while(graus >= 10){
                graus -= 5;
                i++;
                System.out.println("Foram " + i + " minutos para a temperuta " + graus + " graus chegar em inferior a 10 graus");
            }
        }     
        else{
            System.out.println("Digite um valor acima ou igual a 10 graus"); 
        }
    }
}
