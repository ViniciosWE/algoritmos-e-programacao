
 
package h.Aula11_05;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String letra = entrada.next();
        switch(letra){
            case "A": case "E": case "I": case "O": case "U":
            System.out.println("Vogal");
            break;
            case "B":case "C":case "D":case "F":case "G":case "H":case "J":case "K":case "L":case "M":case "N":case "P":case "Q":case "R":case "S":case "T":case "V":case "W":case "X":case "Y":case "Z":
            System.out.println("Consoante");
            break;
            default:
                System.out.print("Não é uma letra");
            break; 
        }
    }
}