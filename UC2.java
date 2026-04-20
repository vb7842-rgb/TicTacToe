import java.util.Random;
import java.util.Scanner;

/**
 * TicTacToe
 * UC2 performs a random toss to decide who plays first and assigns
 * symbols (X or O) to the human and computer accordingly.
 */
public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;
    static Scanner scanner = new Scanner(System.in);

    /**
     * Entry point of the program. Executes the toss logic and displays
     * the result of turn and symbol assignment.
     */
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("  Welcome to Tic-Tac-Toe!  ");
        System.out.println("============================");
        System.out.print("Press Enter to perform the toss...");
        scanner.nextLine(); // Wait for user to press Enter

        tossAndAssignSymbols();
        displayTossResult();

        scanner.close();
    }

    /**
     * Uses random logic to decide the first player and assigns symbols
     * based on the toss outcome. This method initializes the game state.
     */
    static void tossAndAssignSymbols() {
        Random random = new Random();
        int toss = random.nextInt(2); // Generates 0 or 1

        if (toss == 0) {
            // Human goes first
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            // Computer goes first
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    /**
     * Displays the toss result, indicating who plays first and which
     * symbol is assigned to each player.
     */
    static void displayTossResult() {
        System.out.println("\n--- Toss Result ---");
        System.out.println("Human   Symbol : " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);

        if (isHumanTurn) {
            System.out.println("\nResult: Human goes FIRST!");
        } else {
            System.out.println("\nResult: Computer goes FIRST!");
        }
        System.out.println("-------------------");
    }
}