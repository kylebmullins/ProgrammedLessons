import java.util.Scanner;
public class SubString2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        System.out.println("Enter a beginning index: ");
        int begin = scan.nextInt();
        System.out.println("Enter a ending index: ");
        int end = scan.nextInt();
        String sub = str.substring(begin, end);
        System.out.println("Original string:\n" + str + "\nSubstring:\n" + sub);
    }
}