package ClasseMath;

public class Randomico4 {
    public static void main(String[] args) {        
        for (int i = 1; i <= 10; i++) {
            double num = (Math.random() * 100);
            int arred = (int) Math.ceil(num);
            System.out.println(num + " - " + arred);
        }        
    }
}
