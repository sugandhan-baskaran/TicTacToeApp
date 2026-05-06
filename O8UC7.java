import java.util.Random;

public class O8UC7 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initializeBoard();

        computerMove('O');

        printBoard();
    }

    static void initializeBoard() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                board[i][j] = '-';
            }
        }
    }

    static void computerMove(char symbol) {

        Random random = new Random();

        while (true) {

            int slot = random.nextInt(9) + 1;

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (board[row][col] == '-') {

                placeMove(row, col, symbol);

                System.out.println("Computer selected slot: " + slot);

                break;
            }
        }
    }

    static void placeMove(int row, int col, char symbol) {

        board[row][col] = symbol;
    }

    static void printBoard() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }
}
