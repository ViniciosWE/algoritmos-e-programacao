package ClasseMath;

import java.util.Scanner;

public class MaiorMenor10Numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número: ");
            int num = entrada.nextInt();
            maior = Math.max(maior, num);
            menor = Math.min(menor, num);
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
