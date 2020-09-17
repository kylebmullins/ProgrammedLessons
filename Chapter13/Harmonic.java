import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter X:");
        double x = scan.nextDouble();
        System.out.println("Enter Y:");
        double y = scan.nextDouble();
        double arith = (x + y)/2;
        double harmo = 2/((1/x)+(1/y));
        System.out.println("Arithmatic mean: " + arith + "\nHarmonic mean: " + harmo);
    }
}