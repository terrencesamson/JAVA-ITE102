/*
    Student Name: Terrence Ross E. Samson
    Course: BS Information Technology
    Activity: Java 2D Array Matrix Operations
    Description: A Java program that uses a 3x3 two-dimensional array
                 to store nine user-inputted integers. It calculates
                 and displays the sum of each row, each column, both
                 diagonals, and the total number of elements. The
                 program also includes a loop that allows the user
                 to enter another set of numbers if desired.
*/

import java.util.Scanner;

// 1. Main class declaration
public class Matrix {
    public static void main(String[] args) {

        // 2. Initialize a 3x3 two-dimensional array
        int[][] Matrix = new int[3][3];
        String option = "";

        // Repeat the program if the user chooses to continue
        do {

            // 3. Create a Scanner object for user input
            Scanner sc = new Scanner(System.in);

            // 4. Ask the user to enter nine integer values
            System.out.println("Input 9 elements: ");

            // 5. Store the entered values inside the 2D array
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    Matrix[row][col] = sc.nextInt();
                }
            }

            // 6. Display the matrix and calculate the sum of each row
            System.out.println("Display Here are the Numbers and the required output:");
            System.out.println("===============================================");
            System.out.printf("%36s%n", "Row Sum:");
            System.out.println();

            for (int i = 0; i < 3; i++) {
                int sum = 0;

                for (int j = 0; j < 3; j++) {
                    sum += Matrix[i][j];
                    System.out.printf("%8d", Matrix[i][j]);
                }

                // Display the computed sum of the current row
                System.out.printf("%12d%n", sum);
            }

            // 7. Calculate and display the sum of each column
            System.out.print("\nColumn sum: ");

            for (int i = 0; i < Matrix[0].length; i++) {
                int sum2 = 0;

                for (int j = 0; j < Matrix.length; j++) {
                    sum2 += Matrix[j][i];
                }

                // Print the total of the current column
                System.out.printf("%8d", sum2);
            }

            // 8. Initialize variables for the two diagonal sums
            int diagonal1 = 0, diagonal2 = 0;

            // 9. Calculate the sums of both diagonals
            for (int i = 0; i < 3; i++) {
                diagonal1 += Matrix[i][i];
                diagonal2 += Matrix[i][2 - i];
            }

            // 10. Display the total number of elements in the array
            System.out.println("\n===============================================");
            System.out.println("Diagonal sum 1: " + diagonal1);
            System.out.println("Diagonal sum 2: " + diagonal2);

            System.out.printf("Display Total Elements: " +
                    (Matrix.length * Matrix[0].length));

            // 11. Ask the user if they want to perform another operation
            System.out.print("\nDo you want try again? (y|n): ");
            option = sc.next();

        // 12. Continue the program if the user enters 'y'
        } while (option.equalsIgnoreCase("y"));
    }
}