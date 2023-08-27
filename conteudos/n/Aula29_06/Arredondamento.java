package ClasseMath;

import java.util.Scanner;

public class Arredondamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        double num = entrada.nextDouble();
        double proxInt = Math.ceil(num);
        System.out.println("Próximo inteiro: " + proxInt);
        double intAnt = Math.floor(num);
        System.out.println("Inteiro anterior: " + intAnt);
    }
}
