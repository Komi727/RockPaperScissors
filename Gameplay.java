import java.util.Scanner;

public class Gameplay {
    public static void main(String[] args) {
        int playerScore = 0;
        int playerScore2 = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors");
//        input.nextLine();
        System.out.println("Would you like to play?: ");
        
        String play = input.nextLine();
        if (play.equals("yes")) {
            while(playerScore < 3 && playerScore < 3) {
                System.out.println("Rock, Paper, or, Scissors?");
            }
        } else {
            System.out.println("Program terminated");
        }
    }
}
