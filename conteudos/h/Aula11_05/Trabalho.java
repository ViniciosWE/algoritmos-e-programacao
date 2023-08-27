// Ivan e Vinicios
package h.Aula11_05;

import java.util.Scanner;

public class Trabalho {
  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o dia da semana");
        String semana = entrada.next();
        System.out.println("Qual a velocidade");
        int velocidade = entrada.nextInt();
        switch(semana){
            case "segunda": case "terça": case "quarta": case "quinta": case "sexta":
            if(velocidade <= 30){
                System.out.println("Ésta dentro do limite");
            }
            else{
                if(velocidade <= 30 + (30 * 0.2) ){
                    System.out.println("Multa de R$ 85,13 e 4 pontos na carteira");
                }
                else{
                    if(velocidade <= 30 + (30 * 0.5)){
                        System.out.println("Multa de R$ 127,69 e 5 pontos na carteira");
                    }
                    else{
                         System.out.println("Multa de R$ 321,45 e 8 pontos na carteira");
                    }
                }
            }
            break;
            
            case "sabado": case "domingo": 
            if(velocidade <= 50){
            System.out.println("Ésta dentro do limite");
            }
            else{
                if(velocidade <= 50 + (50 * 0.2) ){
                    System.out.println("Multa de R$ 85,13 e 4 pontos na carteira");
                }
                else{
                    if(velocidade <= 50 + (50 * 0.5)){
                        System.out.println("Multa de R$ 127,69 e 5 pontos na carteira");
                    }
                    else{
                         System.out.println("Multa de R$ 321,45 e 8 pontos na carteira");
                    }
                }
            }
            break;
            default:
                System.out.println("Insira um dia semana válido!");
        }  
    }
}
