import java.util.Random;
import java.util.Scanner;

public class DragonCave {

    public static void main(String[] args) {

//        int randomNumber = (int) (Math.random() * 2) + 1; //random number generator
//        Scanner sc = new Scanner(System.in);   //Scanner class
//        int userInput = sc.nextInt();  // User enters number 1 or 2
//        String state = sc.nextLine();

        System.out.println(welcome());
        System.out.println(playGame());
    }

    public static String welcome() {
        return "You are in a land full of dragons. In front of you,\r\n" +
                "\r\n" +
                "you see two caves. In one cave, the dragon is friendly\r\n" +
                "\r\n" +
                "and will share his treasure with you. The other dragon\r\n" +
                "\r\n" +
                "is greedy and hungry and will eat you on sight.\r\n" +
                "\r\n" +
                "Which cave will you go into? (1 or 2)";
    }

    public static String playGame() {
        try {
            int randomNumber = (int) (Math.random() * 2) + 1; //random number generator
            Scanner sc = new Scanner(System.in);   //Scanner class
            int userInput = sc.nextInt();  // User enters number 1 or 2
            String state = sc.nextLine();

            if (userInput == randomNumber) { // n is odd
                return "You approach the cave...\r\n" +
                        "\r\n" +
                        "It is dark and spooky...\r\n" +
                        "\r\n" +
                        "A large dragon jumps out in front of you! He opens his jaws and...\r\n" +
                        "\r\n" +
                        "Gobbles you down in one bite!";

            } else if (userInput != randomNumber) {   //if the user enters an invalid choice
                System.out.println("You approached the cave\n\nA friendly dragon appears...\n\nHe shares his treasure with you\n\nCongratulations you got your treasure!");
            } else {    //if the user's choice doesn't match with the random number
                System.out.println("Wrong choice");
            }
        } catch (Exception e) {
            System.out.println("Invalid entry");
        }
        return "Thank you for playing!";
    }
}



