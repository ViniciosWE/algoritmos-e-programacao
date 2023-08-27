
package l.Aula15_06;

import java.util.Scanner;

public class Exemplo8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Senha: ");
        String senha = entrada.nextLine();
        if(senha.equals("123456")){
            System.out.println("ACESSO PERMITIDO");
        }
        else{
            System.out.println("ACESSO NEGADO");
        }
    }
}
