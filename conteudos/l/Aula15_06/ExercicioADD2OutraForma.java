
package l.Aula15_06;

import java.util.Scanner;

public class ExercicioADD2OutraForma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite número: ");
        int num = entrada.nextInt();
        int impares = 1;
        int resultSub = num;
        int sub = 0;
        while(resultSub > 0){
            resultSub -= impares;
            impares += 2;
            sub++;
        }
        System.out.println("Raiz quadrada de " + num + " é " + sub);
    }
}
