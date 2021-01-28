import java.util.Scanner;

/*-------------------------------------------------------------
// AUTHOR: Hannah Stojack
// FILENAME: Lab #4
// SPECIFICATION: your own description of the program.
// FOR: CSE 110- Lab #4
// TIME SPENT: how long it took you to complete the assignment.
//-----------------------------------------------------------*/

// Import Scanner class

public class Lab4 {

    public static void main(String[] args) {
        // Declare some variables you need
        // -->

        int choice = 1;
        Scanner scan = new Scanner(System.in);

        do {
            // Display the menu
            displayMenu();
            choice = scan.nextInt();

            // Ask the user for one option
            // -->

            switch (choice) {
                case 1:
                    System.out.println("Enter n");
                    double n = scan.nextDouble();
                    for (int i = 1; i <= n; i++) {
                        if (isPerfectSquare(i))
                            System.out.print(i + " ");
                    }
                    System.out.println();

                    break;

                default:

                    // Define four cases for different options. Don't forget "break".
                    // -->
            }
        } while (choice != 4);
        // end of loop

    }

    private static boolean isPerfectSquare(double n) {
        double squared = Math.sqrt(n);
        int truncated = (int) Math.sqrt(n);

        return squared == truncated;

    }

    /**
     * Print the menu
     */
    private static void displayMenu() {
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1) Calculate the sum of integers from 1 to m");
        System.out.println("2) Calculate the factorial of a given number");
        System.out.println("3) Display the leftmost digit of a given number");
        System.out.println("4) Quit");
    }
}
