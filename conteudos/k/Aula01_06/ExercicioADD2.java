
package k.Aula01_06;

import java.util.Scanner;

public class ExercicioADD2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int num = entrada.nextInt();
        int valor = 1;
        int raiz;
        int resultado = 0;
        while(valor <= num){
            raiz = num / valor;
            if((raiz * raiz) == num){
                resultado = raiz;
                break;
            }
            valor++;
        }
        if((resultado * resultado) == num ){
        System.out.println(resultado + " É a raiz exata de " + num);
        }
        else{
            System.out.println(num + " Não tem raiz exata");
        }      
    }
}
