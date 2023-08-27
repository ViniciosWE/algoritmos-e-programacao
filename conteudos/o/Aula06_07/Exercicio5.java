
package o.Aula06_07;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int random = (int) (Math.random() * 10);
        System.out.print("Tente adivinhar o número entre 1 e 9: ");
        int tent = 0;
        boolean win = false;
        while (!win && tent < 5) {
            int num = entrada.nextInt();
            if (num == random) {
                System.out.println("Você venceu!");
                win = true;
                break;
            }
            if (num > random) {
                System.out.println("Seu chute foi alto");
                tent++;
            } else {
                System.out.println("Seu chute foi baixo");
                tent++;
            }
        }
        if (!win)
        System.out.println("Você perdeu, o número era " + random);
    }
}
