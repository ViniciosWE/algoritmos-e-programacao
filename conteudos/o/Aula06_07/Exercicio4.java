
package o.Aula06_07;

import java.io.*;

public class Exercicio4 {
    public static void main(String[] args) throws IOException {
       BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite seu CPF: ");
        String cpf = entrada.readLine();
        int tamanhoCpf = cpf.length();
        if(tamanhoCpf == 11){
            String cpf1 = cpf.replace("0", "Zero, ");
            String cpf2 = cpf1.replace("1", "Um, ");
            String cpf3 = cpf2.replace("2", "Dois, ");
            String cpf4 = cpf3.replace("3", "Três, ");
            String cpf5 = cpf4.replace("4", "Quatro, ");
            String cpf6 = cpf5.replace("5", "Cinco, ");
            String cpf7 = cpf6.replace("6", "Seis, ");
            String cpf8 = cpf7.replace("7", "Sete, ");
            String cpf9 = cpf8.replace("8", "Oito, ");
            String cpf10 = cpf9.replace("9", "Nove, ");
            System.out.println("Seu CPF por extenso é: " + cpf10);
        }
        else{
            System.out.println("CPF invalido o tamanho é de 11 digitos e o seu foi de " + tamanhoCpf);
        }
    }
}
