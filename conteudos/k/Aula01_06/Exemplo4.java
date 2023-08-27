
package k.Aula01_06;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int erros = 0;
        System.out.println("JOGADOR 1");
        System.out.println("Escolha um número: ");
        int num = entrada.nextInt();
        System.out.println("");
        System.out.println("JOGADOR 2");
        boolean vitoria = false;
        while(erros < 7 && !vitoria){
            System.out.println("Chute: ");
            int chute = entrada.nextInt();
            if (num == chute) {
                System.out.println("Parabéns, você venceu!");
            }
            else{
                erros++;
                if(erros == 7){
                    System.out.println("Você perdeu");
                }
                else{
                    System.out.println("Você errou " + erros );
                    System.out.println("Tente novamente!!");
                    if(chute > num){
                        System.out.println("O seu chute foi alto!");
                    }
                    else{
                        System.out.println("O seu chute foi baixo!");
                    }
                }
            }
        }
    }
}
