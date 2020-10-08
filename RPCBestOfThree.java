import java.util.Scanner;

public class RPCBestOfThree {

    public static void main(String[] args) {
        int userScore = 0;
        int computerScore = 0;

        while (!(userScore == 2 || computerScore == 2)) {
            Scanner input = new Scanner(System.in);

            System.out.println("scissor(0), rock(1), paper(2)");
            double userNum = input.nextDouble();

            double computerRandomNum = Math.floor(Math.random() * 3);
            if (computerRandomNum == userNum) {
                System.out.println("Draw");
                userScore++;
                computerScore++;
            } else if (userNum == 0 && computerRandomNum == 1) {
                System.out.println("Computer won, Rock beats Scissors.");
                computerScore++;
            } else if (userNum == 0 && computerRandomNum == 2) {
                System.out.println("Computer lost, Scissors beats Paper.");
                userScore++;
            } else if (computerRandomNum == 2 && userNum == 1) {
                System.out.println("Computer won, Paper beats Rocks.");
                computerScore++;
            }

            if (computerRandomNum == 0 && userNum == 1) {
                System.out.println("Computer lost, Rock beats Scissors.");
                userScore++;
            } else if (computerRandomNum == 0 && userNum == 2) {
                System.out.println("Computer won, Scissors beat papers.");
                computerScore++;
            } else if (computerRandomNum == 1 && userNum == 2) {
                System.out.println("Computer lost, Paper beats Rocks");
                userScore++;
            }

            if (userScore == 2) {
                System.out.println("YOU WON THIS ROUND!");
            } else if (computerScore == 2) {
                System.out.println("COMPUTER WON THIS ROUND!");
            }
        }

    }

}
