package ClasseMath;

import java.util.Scanner;

public class Randomico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 1; i < 10; i++) {
            double num = Math.random();
            System.out.println(num);
        }
    }
}
