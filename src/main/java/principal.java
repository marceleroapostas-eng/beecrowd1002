import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        
        Scanner leitor = new
            Scanner(System.in);
        
        double R;
        double A;
        
        R = leitor.nextDouble();
        
        A = 3.14159 * R * R;
        
        System.out.printf("A=%.4f%n", + A);
        }
}
