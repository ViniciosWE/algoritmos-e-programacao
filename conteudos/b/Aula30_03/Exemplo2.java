
package b.Aula30_03;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("X: ");
        int x = entrada.nextInt();
        System.out.print("Y: ");
        int y = entrada.nextInt();
        int quoc = x / y;
        int resto = x % y;
        System.out.println("Quociente: " + quoc);
        System.out.println("Resto: " + resto);
    }
}
