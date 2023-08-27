
package j.Aula25_05;

import java.util.Scanner;

public class TrabalhoAvaliativo {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Você tem dois caminho para seguir então escolha:");
        System.out.println("caminho 1");
        System.out.println("caminho 2");
        int caminhol1 = entrada.nextInt();
        switch(caminhol1){
            case 1:
                System.out.println("parabéns você acertou");
                System.out.println("você tem um caminho a frente então escolha:");
                System.out.println("caminho 3");
                int caminhol2 = entrada.nextInt();
                switch(caminhol2){
                    case 3:
                        System.out.println("parabéns você acertou");
                        System.out.println("você tem um caminho a frente então escolha:");
                        System.out.println("caminho 7");
                        int caminhol3 = entrada.nextInt();
                        switch(caminhol3){
                            case 7:
                                System.out.println("Parabéns você ganhou!!");
                                break;
                            default:
                                System.out.println("Valor invalido\nperdeu o jogo!!");
                                break;   
                        }
                        break;
                    default:
                        System.out.println("Valor invalido\nperdeu o jogo!!");
                        break;
                }
                break;
            case 2:
                System.out.println("Você tem dois caminho para seguir então escolha:");
                System.out.println("caminho 4");
                System.out.println("caminho 5");
                int caminhol4 = entrada.nextInt();
                switch(caminhol4){
                    case 4:
                        System.out.println("parabéns você acertou");
                        System.out.println("você tem um caminho a frente então escolha:");
                        System.out.println("caminho 6");
                        int caminhol5 = entrada.nextInt();
                        switch(caminhol5){
                        case 6:
                            System.out.println("parabéns você acertou");
                            System.out.println("você tem um caminho a frente então escolha:");
                            System.out.println("caminho 8");  
                            int caminhol6 = entrada.nextInt();
                            switch(caminhol6){
                               case 8:
                                System.out.println("Parabéns você ganhou!!");
                                break;
                                default:
                                System.out.println("Valor invalido\nperdeu o jogo!!");
                                break;  
                            }
                            break;
                        default:
                            System.out.println("Valor invalido\nperdeu o jogo!!");
                            break;  
                        }
                        break;
                    case 5:
                        System.out.println("você errou o caminho\nperdeu o jogo!!");
                        break;
                    default:
                        System.out.println("Valor invalido\nperdeu o jogo!!");
                        break;          
                }
                break;
            default:
                System.out.println("Valor invalido\nperdeu o jogo!!");
                break;
        }
    }
}
