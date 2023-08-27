
package f.Aula04_05;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("1º Valor: ");
        int a = entrada.nextInt();
        System.out.print("2º Valor: ");
        int b = entrada.nextInt();
        System.out.print("3º Valor: ");
        int c = entrada.nextInt();
        
        if ((a >= b) && (b >= c)){
            System.out.println("Na ordem crescente fica " + c  + " " + b + " " + a);
        }
        else{
            if ((b >= a) && (a >= c)){
                System.out.println("Na ordem crescente fica " + c  + " " + a + " " + b);
            }
            else{
                if((c >= a) && (a >= b)){
                    System.out.println("Na ordem crescente fica " + b  + " " + a + " " + c);
                }
                else{
                    if((c >= b) && (b >= a)){
                        System.out.println("Na ordem crescente fica " + a  + " " + b + " " + c);
                    }
                    else{
                        if((a >= c) && (c >= b)){
                            System.out.println("Na ordem crescente fica " + b  + " " + c + " " + a);
                        }
                        else{
                                 System.out.println("Na ordem crescente fica " + a  + " " + c + " " + b);
                        }
                    }
                }
            }
        }
    }
}

