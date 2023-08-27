/* Suponha que haja um vazamento de água em um tanque. A cada minuto, 10 litros 
de água vazam do tanque. Escreva uma classe em Java que solicite que o usuário informe 
a quantidade de água armazenada no tanque e determine em quantos minutos 
o tanque ficará vazio.*/
package m.Aula22_06;

import java.util.Scanner;

public class VazamentoTanque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de água: ");
        int quant = entrada.nextInt();
        int min = 0;
        while (quant > 0){
            quant -= 10;
            min++;
        }
        System.out.println("Levará " + min + " minutos para ficar vazio");
    }
}
