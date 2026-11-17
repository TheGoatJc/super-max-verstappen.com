import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // need for scanning
        char choice;

        do {
            int[][] matrix = new int[3][3];
            // Fixed array dimensions
            System.out.printf("Enter 9 Elements.....\n");

            for(int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[r].length; c++) { // start with 0 to increment
                   matrix[r][c] = in.nextInt();
                }
            }

            System.out.printf("\nDisplay Here are the Numbers and the required outputs:\n");
            System.out.println("=========================================================");
            System.out.printf("%45s\n\n", "Row Sum");

            // Print matrix and calculate Row Sum using loops
            for (int r = 0; r < 3; r++) {
                int rowSum = 0;
                System.out.printf("%10s", "");
                for (int c = 0; c < 3; c++) {
                    System.out.printf("%6d", matrix[r][c]);
                    rowSum += matrix[r][c];
                }
                System.out.printf("%15d\n", rowSum);
            }

            // Calculate and print Column Sum using loops
            System.out.printf("\nColumn sum: ");
            for (int c = 0; c < 3; c++) {
                int colSum = 0;
                for (int r= 0; r < 3; r++) {
                    colSum += matrix[r][c];
                }
                System.out.printf("%6d", colSum);
            }

            System.out.println("\n=========================================================");

            // Calculate Diagonal Sum 1 and Diagonal Sum 2 using loops
            int diag1 = 0;
            int diag2 = 0;
            for (int i = 0; i < 3; i++) {
                diag1 += matrix[i][i];
                diag2 += matrix[i][2-i];
            }
            //Displays the diagonal sums
            System.out.printf("Diagonal sum 1: %d\n", diag1);
            System.out.printf("Diagonal sum 2; %d\n", diag2);

            System.out.print("\nTry Again [y|n]: ");
            choice = in.next().charAt(0);
            System.out.println();
            } while (choice == 'y' || choice == 'Y');in.close();


        }
    }