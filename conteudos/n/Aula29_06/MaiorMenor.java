package ClasseMath;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int num1 = entrada.nextInt();
        System.out.print("Segundo número: ");
        int num2 = entrada.nextInt();
        int maior = Math.max(num1, num2);
        int menor = Math.min(num1, num2);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    } 
}
