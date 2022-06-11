import java.util.Scanner;
import java.util.Random;

public class Gameplay {

    public static final String[] handSigns = {"Rock", "Paper", "Scissors"};

    public static void main(String[] args) {
        // keeps track of player scores
        int playerScore = 0;
        int computerScore = 0;
        // takes in input of user
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors");

        System.out.println("Would you like to play?: ");

        String play = input.nextLine();
        if (play.equals("yes")) {
            while (playerScore < 3 && computerScore < 3) {
                System.out.println("Rock, Paper, or, Scissors?");
                // option for player if they want to quit the game
                if (input.nextLine().equals("exit")) {
                    System.out.println("Program terminated");
                    System.exit(1);
                } else {
                    // Cases where the computer wins
                    if (input.nextLine().equals("Rock") && randomHand() == 1) {
                        computerScore = computerScore + 1;
                    } else if (input.nextLine().equals("Rock")
                            && randomHand() == 2) {
                        playerScore = playerScore + 1;
                    }
                    if (input.nextLine().equals("Paper") && randomHand() == 2) {
                        computerScore = computerScore + 1;
                    } else if (input.nextLine().equals("Paper")
                            && randomHand() == 0) {
                        playerScore = playerScore + 1;
                    }
                    if (input.nextLine().equals("Scissors")
                            && randomHand() == 0) {
                        computerScore = computerScore + 1;
                    } else if (input.nextLine().equals("Scissors")
                            && randomHand() == 1) {
                        playerScore = playerScore + 1;
                    }
                }
                System.out.println("Computer Score: " + computerScore
                        + " | Your Score: " + playerScore);
            }
        } else {
            System.out.println("Program terminated");
        }
    }

    public static int randomHand() {
        // Random hand sign for computer
        Random randomHandSign = new Random();
        int index = randomHandSign.nextInt(handSigns.length);
        return index;
    }

}
