
package l.Aula15_06;

import java.util.Scanner;

public class Exemplo9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Senha: ");
        String senhac = "123456";
        String senha = entrada.nextLine();
        if(senha.equals(senhac)){
            System.out.println("ACESSO PERMITIDO");
        }
        else{
            System.out.println("ACESSO NEGADO");
        }
    }
}
