
package i.Aula18_05;

public class Exercicio2 {
    public static void main(String[] args) { 
        int cont = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 8 == 0){
                System.out.println(i + " é múltiplo de 8");
                cont++;
            } 
        }
        System.out.println("o total de multiplos de 8: " + cont);
    }
}
