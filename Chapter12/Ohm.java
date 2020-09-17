import java.util.Scanner;
public class Ohm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the Voltage?");
        int V = scan.nextInt();
        System.out.println("What is the Resistance?");
        int R = scan.nextInt();
        double I = (V + 0.0)/R;
        System.out.println("The Current is " + I + " ohms.");
    }
}