
package i.Aula18_05;

public class ExercicioADD4 {
    public static void main(String[] args) {
        int ant = 0;
        int atual = 1;
        for (int i = 1; i <= 20; i++) {
            System.out.println(atual);
            int aux = atual + ant;
            ant = atual;
            atual = aux;
            
        }       
    }
}
