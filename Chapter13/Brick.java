import java.util.Scanner;
public class Brick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of seconds:");
        double seconds = scan.nextDouble();
        double distance = (34.174/2) * Math.pow(seconds, 2);
        System.out.println("Distance: " + distance);
    }
}