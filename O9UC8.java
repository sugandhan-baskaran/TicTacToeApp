public class O9UC8 {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {

                System.out.println("Human Player Turn");

            } else {

                System.out.println("Computer Player Turn");
            }

            if (checkWin() || checkDraw()) {

                gameOver = true;

                System.out.println("Game Over");

            } else {

                isHumanTurn = !isHumanTurn;
            }
        }
    }

    static boolean checkWin() {

        return false;
    }

    static boolean checkDraw() {

        return false;
    }
}
