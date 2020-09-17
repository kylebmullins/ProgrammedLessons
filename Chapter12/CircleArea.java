import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        int r;
        Scanner rad = new Scanner(System.in);
        System.out.println("Input the Radius: ");
        r = rad.nextInt();
        double area = Math.pow(r, 2) * Math.PI;
        System.out.println("The radius is: " + r + "\n The area is: " + area);
    }
}