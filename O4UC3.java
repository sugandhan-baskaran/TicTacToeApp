import java.util.Scanner;

public class O4UC3 {

    public static int acceptUserSlotInput(Scanner scanner) {
        int slot;

        do {
            System.out.print("Enter slot number (1-9): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter number (1-9): ");
                scanner.next();
            }

            slot = scanner.nextInt();

        } while (slot < 1 || slot > 9);

        return slot;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userSlot = acceptUserSlotInput(scanner);

        System.out.println("Selected Slot: " + userSlot);
    }
}