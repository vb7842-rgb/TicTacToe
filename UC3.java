import java.util.Scanner;

/**
 * TicTacToe
 * UC3 reads a slot number (1-9) entered by the user. This use case
 * focuses only on input handling without validation.
 */
public class TicTacToe {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Entry point of the program. Reads slot input and prints it back
     * to verify correct user input handling.
     */
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("  Welcome to Tic-Tac-Toe!  ");
        System.out.println("============================");
        System.out.println();
        System.out.println("The board slots are numbered as follows:");
        System.out.println();
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println();

        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);

        scanner.close();
    }

    /**
     * Reads an integer slot value from the user.
     * Input: Scanner object
     * Output: Slot number (1-9)
     * Hint: Validation will be added in later use cases.
     */
    static int getUserSlot() {
        System.out.print("Enter your slot number (1-9): ");
        int slot = scanner.nextInt();
        return slot;
    }
}