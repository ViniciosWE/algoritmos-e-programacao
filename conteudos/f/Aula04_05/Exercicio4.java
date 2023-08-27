
package f.Aula04_05;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.print("1º Valor: ");
        int x = entrada.nextInt();
        System.out.print("2º Valor: ");
        int y = entrada.nextInt();
        
        if(x > 0 && y > 0){
            System.out.print("1º Q");
        }
        else{
            if(x < 0 && y > 0 ){
                System.out.print("2º Q");
            }
            else{
                if(x < 0 && y < 0){
                    System.out.print("3º Q");
                }
                else{
                    if(x > 0 && y < 0 ){
                        System.out.print("4º Q");
                    }
                    else{
                        if(x == 0 && y == 0){
                            System.out.print("Origem");
                        }
                        else{
                            if(x == 0 && y > 0){
                                System.out.print("Esta no eixo y positivo");
                            }
                            else{
                                if(x == 0 && y < 0){
                                    System.out.print("Esta no eixo y negativo");
                                }
                                else{
                                    if(x > 0 && y == 0){
                                        System.out.print("Esta no eixo x positivo");
                                    }
                                    else{
                                        System.out.print("Esta no eixo x negativo");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}