
package k.Aula01_06;

public class Exercicio4 {
    public static void main(String[] args) {
        int anos = 0; 
        
        int alturaAnacleto = 150;
        int alturaFelisberto = 110;
        
        while(alturaFelisberto <= alturaAnacleto){
            alturaAnacleto += 2;
            alturaFelisberto += 3;
            
            anos++;
        }
        System.out.println("Precisam de " + anos + " anos para Felisberto ser maior que Anacleto");
    }
}
