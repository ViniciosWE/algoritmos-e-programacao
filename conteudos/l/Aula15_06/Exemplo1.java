
package l.Aula15_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemplo1 {
    public static void main(String[] args) throws IOException{
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Digite o seu nome: ");
        String nome = entrada.readLine();
    }
}
