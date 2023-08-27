
package o.Aula06_07;

import java.io.*;

public class Exercicio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite um texto: ");
        String texto = entrada.readLine();
        System.out.println("Quantidade de caracteres informados, incluindo os espaços em branco: "
            + texto.length());
        int cont= 1;
        for (int i = 0; i < texto.length(); i++) {
            String esp = String.valueOf(texto.charAt(i));
            switch (esp) {
                case " ":
                    cont++; 
                break;
            }
        }
        System.out.println("Na frase contém " + cont + " palvras" );
    }
}
