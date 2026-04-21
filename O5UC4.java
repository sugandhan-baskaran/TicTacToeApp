public class O5UC4 {

    public static void main(String[] args) {
        int slot = 7;

        if (slot >= 1 && slot <= 9) {
            System.out.println("Row: " + getRowFromSlot(slot));
            System.out.println("Column: " + getColFromSlot(slot));
        } else {
            System.out.println("Invalid slot");
        }
    }

    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}
