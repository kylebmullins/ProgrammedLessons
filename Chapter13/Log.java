import java.util.Scanner;
public class Log {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a double:");
        double in = scan.nextDouble();
        double log = Math.log(in)/Math.log(2);
        System.out.println("Base 2 log of " + in + " is " + log);
    }
}