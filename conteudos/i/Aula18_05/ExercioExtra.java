
package i.Aula18_05;

public class ExercioExtra {
    public static void main(String[] args) {
        for (int tab = 0; tab <= 10; tab++) {
            System.out.println("TABUADA DO " + tab);
            for (int mult = 0; mult < 10; mult++) {
                System.out.println(tab + "X" + mult + "=" + (tab * mult));
            }
        }
    }
}
