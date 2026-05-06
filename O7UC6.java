import java.util.Scanner;

public class O7UC6 {

    static char[][] board = new char[3][3];

    public static void initializeBoard() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                board[i][j] = '-';
            }
        }
    }

    public static void displayBoard() {

        System.out.println("Current Board:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static boolean placeMove(int row, int col, char symbol) {

        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {

            board[row][col] = symbol;

            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            initializeBoard();
            
            displayBoard();
            
            System.out.print("Enter row: ");
            int row = sc.nextInt();
            
            System.out.print("Enter column: ");
            int col = sc.nextInt();
            
            if (placeMove(row, col, 'X')) {
                
                System.out.println("Move placed successfully");
            }
            
            else {
                
                System.out.println("Invalid move");
            }
            
            displayBoard();
        }
    }
}