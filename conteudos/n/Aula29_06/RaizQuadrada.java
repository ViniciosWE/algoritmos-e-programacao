package ClasseMath;

import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        int num = entrada.nextInt();
        double raizQuad = Math.sqrt(num);
        System.out.println("Raiz Quadrada: " + raizQuad);
    }
}
