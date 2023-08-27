package n.Aula29_06;

import java.io.*;

public class ExemploString {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nome: ");
        String nome = entrada.readLine();
        System.out.print("Sobrenome: ");
        String sob = entrada.readLine();
        String nomeCompleto = nome + " " + sob;
        System.out.println("Nome Completo: " + nomeCompleto);
        boolean cadastroFinalizado = false;
        while(!cadastroFinalizado){
            System.out.print("Login: ");
            String login = entrada.readLine();
            if (!(login.length() >= 8 && login.length() <= 10)) {
                System.out.println("Quant. de caracteres não atende aos requisitos");
                cadastroFinalizado = false;
            }
            else{
                String primChar = String.valueOf(login.charAt(0));
                switch(primChar){
                    case "0": case "1": case "2": case "3": case "4":
                    case "5": case "6": case "7": case "8": case "9":
                        System.out.println("O primeiro caracter precisa ser uma letra!");
                        cadastroFinalizado = false;
                        break;
                    default: System.out.println("Login ok!");
                        cadastroFinalizado = true;
                }
            }
            System.out.print("Senha: ");
            String senha = entrada.readLine();
            System.out.print("Confirme a senha: ");
            String confirmSenha = entrada.readLine();
            if (senha.equals(confirmSenha)){
                System.out.println("Senha ok!");
                cadastroFinalizado = true;
            }
            else{
                System.out.println("Senhas não são iguais");
                cadastroFinalizado = false;
            }
        }
    }
}
