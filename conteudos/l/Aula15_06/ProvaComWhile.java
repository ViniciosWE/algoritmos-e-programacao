
package l.Aula15_06;

import java.util.Scanner;

public class ProvaComWhile {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos começar!");
        int tentativas = 0;
        boolean venceu = false;
        while ((tentativas < 3) && (venceu == false)){
            tentativas++;
            System.out.print("Qual o caminho que você quer seguir? ");
            int caminho = entrada.nextInt();
            switch(caminho){
                case 1:
                    System.out.print("Muito bem! Para onde vamos agora? ");
                    caminho = entrada.nextInt();
                    if (caminho == 3){
                        System.out.print("Quase lá! Para onde vamos? "); 
                        caminho = entrada.nextInt();
                        if (caminho == 7){
                            System.out.println("Muito bem! Você chegou ao destino!");
                            venceu = true;
                            break;
                        }
                        else
                            System.out.println("Você perdeu!");
                    }
                    else
                        System.out.println("Caminho inválido! Você perdeu!");
                    break;
                case 2:
                    System.out.print("Muito bem! Para onde vamos agora? ");
                    caminho = entrada.nextInt();
                    if (caminho == 4){
                        System.out.print("Quase lá! Para onde vamos? "); 
                        caminho = entrada.nextInt();
                        if (caminho == 6){
                            System.out.print("Muito bem! Qual é o próximo caminho? ");
                            caminho = entrada.nextInt();
                            if (caminho == 8){
                                System.out.println("Parabéns! Você chegou ao destino");
                                venceu = true;
                                break;
                            }
                            else
                                System.out.println("Caminho inválido! Você perdeu!");
                        }
                        else
                            System.out.println("Caminho inválido! Você perdeu!");
                    }   
                    else{
                        if (caminho == 5)
                            System.out.print("Rota sem saída! Você perdeu!"); 
                        else
                            System.out.println("Caminho inválido! Você perdeu!");
                    }
                    break;
                default:
                    System.out.println("Caminho inválido! Você perdeu!");
            }
        }
    } 
}
