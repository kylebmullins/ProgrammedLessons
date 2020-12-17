import java.io.*;
import java.util.Random;
import java.util.Scanner;


//I know it isn't the most efficient or pretty, but it works and I tried my best
//Yes I know I have too many scanners but the places you need to input stuff kept getting skipped when I was using the same one.

public class Medieval {
    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws IOException, FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        int option = 0;
        System.out.println(clear() + "Welcome to Medieval Times, an exciting new turn based, multi-party rpg! Form a band of 4 medieval themed characters and journey through the land on a quest to rid the kingdom of evil monsters and men!\n\n\n\t\t\tInput number option:\n\n\t(1): Create new game\t\t(2): Validate Save File\n\n\t(3): Reroll Character\t\t(4): Quit\n\n\n\n\n");
        while (option < 1 || option > 4) {
        option = scan.nextInt();
        }
        if (option == 1) {
            newGame();
        } else if (option == 2) {
            Scanner file = new Scanner(System.in);
            System.out.println(clear() + "Please input a name of a '.md' file to validate without the '.md':");
            String fileName = file.nextLine();
            validate(fileName);
        } else if (option == 3) {
            Scanner roll = new Scanner(System.in);
            System.out.println(clear() + "Name a save file to reroll:");
            String save = roll.nextLine();
            System.out.println("\nName a character to reroll:");
            String character = roll.nextLine();
            reroll(save, character);
        } else if (option == 4) {
            System.out.println("\nThanks for Playing!");
            System.exit(0);
        }

    }

    private static String clear() {
        return "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    }

    public static void newGame() throws IOException {
        Scanner scan = new Scanner(System.in);
        String name;
        PrintWriter game;

        System.out.println(clear() + "Name of the save file?");
        name = scan.nextLine();

        Character One = new Character();
        Character Two = new Character();
        Character Three = new Character();
        Character Four = new Character();

        One.characterMaker();
        Two.characterMaker();
        Three.characterMaker();
        Four.characterMaker();

        game = new PrintWriter(name + ".md");
        game.println(name + "\n" + One.characterPrint() + "\n" + Two.characterPrint() + "\n" + Three.characterPrint() + "\n" + Four.characterPrint());
        game.flush();
        game.close();
        menu();
    }

    public static void validate(String fileName) throws IOException, FileNotFoundException {
        int textCount = 0;
        File file = new File (fileName + ".md");
        Scanner fileScan = new Scanner(file);
        Scanner text = new Scanner(System.in);
        String valid;
        fileScan.useDelimiter(",|\\n");
        while (fileScan.hasNext()) {
            textCount++;
            valid = fileScan.next();
        }
        if (textCount == 29) {
            System.out.println("\n" + fileName + ".md IS valid! Input anything to go back to the menu.");
            valid = text.next();
            menu();
        }
        System.out.println("\n" + fileName + ".md is NOT valid. Input anything to go back to the menu.");
            valid = text.next();
            menu();
    }

    public static void reroll(String fileName, String character) throws IOException, FileNotFoundException {
        File file = new File (fileName + ".md");
        Scanner fileScan = new Scanner(file);
        Scanner text = new Scanner(System.in);
        String findName;
        String type;
        int strength = 0;
        int toughness = 0;
        int intelligence = 0;
        int magic = 0;
        int influence = 0;
        int count = 0;
        String write = "";
        Random rand = new Random();
        fileScan.useDelimiter(",|\\n");
        while (fileScan.hasNext()) {
            findName = fileScan.next();
            if (findName.equals(character)) {
                type = fileScan.next();
                write = write + findName + "," + type + ",";
                if (fileScan.nextInt() > 6) {
                    strength = rand.nextInt(3) + 7;
                } else {
                    strength = rand.nextInt(6);
                }
                count++;
                if (fileScan.nextInt() > 6) {
                    toughness = rand.nextInt(3) + 7;
                } else {
                    toughness = rand.nextInt(6);
                }
                count++;
                if (fileScan.nextInt() > 6) {
                    intelligence = rand.nextInt(3) + 7;
                } else {
                    intelligence = rand.nextInt(6);
                }
                count++;
                if (fileScan.nextInt() > 6) {
                    magic = rand.nextInt(3) + 7;
                } else {
                    magic = rand.nextInt(6);
                }
                count++;
                if (fileScan.nextInt() > 6) {
                    influence = rand.nextInt(3) + 7;
                } else {
                    influence = rand.nextInt(6);
                }
                count++;
                write = write + strength + "," + toughness + "," + intelligence + "," + magic + "," + influence + "\n";
                count = 1;
            } else {
                write += findName;
                count++;
                if (count == 1 || count == 8) {
                    write += "\n";
                    count = 1;
                } else {
                    write += ",";
                }
            }
        }
        PrintWriter game = new PrintWriter(fileName + ".md");
        game.write(write);
        game.flush();
        game.close();
        System.out.println(clear() + "The stats of character " + character + " are as follows:\n\nStrength: " + strength + "\nToughness: " + toughness + "\nIntelligence: " + intelligence + "\nMagic: " + magic + "\nInfluence: " + influence + "\n\nTo go back to the menu, input anything.");
        String wait = text.next();
        menu();
    }

}