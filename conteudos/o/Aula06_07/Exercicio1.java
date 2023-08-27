
package o.Aula06_07;

import java.io.*;

public class Exercicio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Nome completo: ");
        String nomeCompleto = entrada.readLine();
        System.out.println("Quantidade de caracteres informados, incluindo os espaços em branco: " 
            + nomeCompleto.length());
        System.out.println("Nome completo com todas as letras em maiúsculo: " 
            + nomeCompleto.toUpperCase());
        int quantidadeVogais = 0;
        for (int i = 0; i < nomeCompleto.length(); i++) {
           String nomeMinusculo = nomeCompleto.toLowerCase();
           String vogais = String.valueOf(nomeMinusculo.charAt(i));
            switch (vogais) {
                case "a":  case "e":  case "i":  case "o":  case "u": 
                quantidadeVogais++;    
                break;
            }
        }

        System.out.println("A quantidade de vogais no nome completo é: " + quantidadeVogais);
       
    }
}
