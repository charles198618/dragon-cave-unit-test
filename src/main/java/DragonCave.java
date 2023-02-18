import java.util.Scanner;

public class DragonCave {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   //Scanner class

        System.out.println(welcome());
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

}
