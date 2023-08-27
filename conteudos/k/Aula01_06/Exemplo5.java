
package k.Aula01_06;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        int a = 2000;
        int b = 0;
        int tempo = 0;
        while(a != b){
            a -= 10;
            b += 15;
            tempo ++;
            System.out.println("");
            System.out.println("Tempo: " + tempo);
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        }
    }
}
