import java.util.Scanner;

/**
 * TicTacToe
 * UC4 converts a user-entered slot number (1-9) into corresponding
 * row and column indices of a 2D array.
 */
public class TicTacToe {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Entry point of the program. Demonstrates slot-to-index conversion
     * using a user-entered slot value.
     */
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("  UC4: Slot to Board Index  ");
        System.out.println("============================");
        System.out.println();
        System.out.println("Slot reference:");
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println();

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();

        System.out.println();
        System.out.println("--- Conversion Result ---");
        System.out.println("Slot   : " + slot);
        System.out.println("Row    : " + getRowFromSlot(slot));
        System.out.println("Column : " + getColFromSlot(slot));
        System.out.println("-------------------------");

        // Demonstrate all slot mappings
        System.out.println();
        System.out.println("--- Full Slot Mapping Table ---");
        System.out.println("Slot | Row | Column");
        System.out.println("------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.println("  " + i + "  |  " + getRowFromSlot(i) + "  |   " + getColFromSlot(i));
        }

        scanner.close();
    }

    /**
     * Converts slot number into row index using zero-based indexing.
     * Input:  Slot number (1-9)
     * Output: Row index (0-2)
     * Formula: row = (slot - 1) / 3
     */
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    /**
     * Converts slot number into column index using modulo operation.
     * Input:  Slot number (1-9)
     * Output: Column index (0-2)
     * Formula: col = (slot - 1) % 3
     */
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}