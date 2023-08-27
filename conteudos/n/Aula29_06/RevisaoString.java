package n.Aula29_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevisaoString {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite um texto: ");
        String texto = entrada.readLine();
        int tamTexto = texto.length();
        System.out.println("Quant. caracteres: " + tamTexto);
        String charPos5 = String.valueOf(texto.charAt(5));
        System.out.println("Caracter na posição 5 (6º caracter): " + charPos5);
        String textoMaiusc = texto.toUpperCase();
        System.out.println("Texto em letras maiúsculas: " + textoMaiusc);
        String textoMinusc = texto.toLowerCase();
        System.out.println("Texto em letras minúsculas: " + textoMinusc);
        String textoSemEsp = texto.replace(" ", "");
        System.out.println("Texto sem espaços: " + textoSemEsp);
        String textoSemA = texto.replace("a", "@");
        textoSemA = textoSemA.replace("A", "@");
        System.out.println("Texto sem a letra A: " + textoSemA);
        if (texto.equals(textoSemEsp)){
            System.out.println("Não houve alteração utilizando replace");
        }
        else{
            System.out.println("Texto alterado com replace");
        }
    }
}
