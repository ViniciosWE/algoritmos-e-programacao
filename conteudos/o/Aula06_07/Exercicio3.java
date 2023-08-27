
package o.Aula06_07;

import java.io.*;

public class Exercicio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Digite um texto: ");
        String texto = entrada.readLine();
        String texto1 = texto.replace("a" , "@");
        String texto2 = texto1.replace("A" , "@");
        String texto3 = texto2.replace("e" , "&");
        String texto4 = texto3.replace("E" , "&");
        String texto5 = texto4.replace("i" , "!");
        String texto6 = texto5.replace("I" , "!");
        String texto7 = texto6.replace("o" , "*");
        String texto8 = texto7.replace("O" , "*");
        String texto9 = texto8.replace("u" , "#");
        String texto10 = texto9.replace("U" , "#");
        String texto11 = texto10.replace(" " , "");
        System.out.println("Nova frase: " + texto11);
    }
}
