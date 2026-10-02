import java.util.Scanner;
import java.util.Random;

public class week1q1 {
    static String playRound(String p, String c) {
        if (p.equals(c)) return "Draw";
        if ((p.equals("Rock") && c.equals("Scissors")) ||
            (p.equals("Paper") && c.equals("Rock")) ||
            (p.equals("Scissors") && c.equals("Paper")))
            return "Player Wins";
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random r = new Random();

        int win = 0, loss = 0, draw = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter your move: ");
            String p = sc.next();

            String c = moves[r.nextInt(3)];
            String result = playRound(p, c);

            System.out.println("Computer: " + c);
            System.out.println("Result: " + result);

            if (result.equals("Player Wins")) win++;
            else if (result.equals("Computer Wins")) loss++;
            else draw++;
        }

        System.out.println("\nWins: " + win);
        System.out.println("Losses: " + loss);
        System.out.println("Draws: " + draw);
        System.out.println("Win %: " + (win * 100.0 / 5));
    }
}
