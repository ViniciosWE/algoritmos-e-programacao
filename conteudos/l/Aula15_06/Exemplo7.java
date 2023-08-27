
package l.Aula15_06;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Senha: ");
        String senha = entrada.nextLine();
        if(!senha.equals("123456")){
            System.out.println("ACESSO NEGADO");
        }
        else{
            System.out.println("ACESSO PERMITIDO");
        }
    }
}