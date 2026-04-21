import java.util.Scanner;

/**
 * TicTacToe
 * UC5 validates whether a move is inside the board boundaries
 * and whether the selected cell is empty.
 */
public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static Scanner scanner = new Scanner(System.in);

    /**
     * Entry point of the program. Tests the validation logic
     * using user-entered row and column values.
     */
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("   UC5: Validate User Move  ");
        System.out.println("============================");
        System.out.println();

        // Print current board state
        System.out.println("Current Board:");
        printBoard();
        System.out.println();

        // Simulate an occupied cell for testing
        board[1][1] = 'X'; // Mark center as occupied
        System.out.println("(Center cell [1][1] marked as 'X' for testing)");
        System.out.println();

        // Take user input for testing
        System.out.print("Enter row (0-2): ");
        int row = scanner.nextInt();

        System.out.print("Enter col (0-2): ");
        int col = scanner.nextInt();

        System.out.println();
        System.out.println("--- Validation Result ---");
        boolean result = isValidMove(row, col);

        if (result) {
            System.out.println("Move at [" + row + "][" + col + "] is VALID ✓");
        } else {
            System.out.println("Move at [" + row + "][" + col + "] is INVALID ✗");
        }
        System.out.println("-------------------------");

        // Show full validation test for all cells
        System.out.println();
        System.out.println("--- Validation Test for All Cells ---");
        System.out.println("Row | Col | Valid?");
        System.out.println("--------------------");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("  " + r + "  |  " + c + "  |  " + isValidMove(r, c));
            }
        }

        scanner.close();
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input:  Row, Column
     * Output: true if valid, false otherwise.
     */
    static boolean isValidMove(int row, int col) {
        // Check boundary: row and column must be between 0 and 2
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("  Reason: Out of bounds!");
            return false;
        }

        // Check if cell is already occupied
        if (board[row][col] != '-') {
            System.out.println("  Reason: Cell already occupied!");
            return false;
        }

        return true;
    }

    /**
     * Prints the current state of the board.
     */
    static void printBoard() {
        System.out.println("--------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("--------------");
        }
    }
}