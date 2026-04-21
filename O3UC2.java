import java.util.Random;

public class O3UC2 {

    public static void main(String[] args) {

        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol;
        char player2Symbol;
        String currentPlayer;

        Random random = new Random();
        int toss = random.nextInt(2);

        if (toss == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = player2;
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        System.out.println("Toss Completed!");
        System.out.println(player1 + " Symbol: " + player1Symbol);
        System.out.println(player2 + " Symbol: " + player2Symbol);
        System.out.println("First Turn: " + currentPlayer);
    }
}
