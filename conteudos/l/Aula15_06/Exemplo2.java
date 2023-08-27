
package l.Aula15_06;

import java.io.*;

public class Exemplo2 {
    public static void main(String[] args)throws IOException {
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));   
        System.out.println("Digite o seu nome: ");
        String nome = entrada.readLine();
        int tamanho = nome.length();
        System.out.println("Quantidade de caracteres " + tamanho);
    }
}
