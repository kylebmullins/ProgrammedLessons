import java.util.Random;
import java.util.Scanner;
public class SnakeEyes {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        double averageScore = 0;
        double averageRolls = 0;
        double four = 0;
        double percent = 0;
        System.out.println("How many times should the simulation run?");
        double times = scan.nextDouble();
        scan.close();
        for (int x = 0; x <= times; x++) {
            int dieOne = 0;
            int dieTwo = 0;
            int rolls = 0;
            int score = 0;
            while (dieOne + dieTwo != 2) {
                dieOne = random.nextInt(6);
                dieTwo = random.nextInt(6);
                score = (score + dieOne + dieTwo);
                rolls++;
            }
            averageRolls = averageRolls + rolls;
            averageScore = averageScore + score;
            if (rolls > 4) {
                four++;
            }
        }
        averageRolls = averageRolls / times;
        averageScore = averageScore / times;
        percent = 100 * (four / times);
        System.out.println("Average Rolls: " + averageRolls + "\nAverage Score: " + averageScore + "\nPercent with more than four rolls: " + percent + "%");
    }
}