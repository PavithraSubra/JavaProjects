import java.util.Scanner;

public class AddMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get dimensions of the first matrix
        System.out.print("Enter the number of rows and columns for the first matrix (separated by space): ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();

        // Validate dimensions (optional)
        if (rows1 < 1 || rows1 > 100 || cols1 < 1 || cols1 > 100) {
            System.err.println("Error: Invalid dimensions for first matrix. Please enter values between 1 and 100.");
            return;
        }

        // Initialize the first matrix
        int[][] matrix1 = new int[rows1][cols1];

        // Get input for the first matrix
        System.out.println("Enter elements for the first matrix (each row separated by newline):");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Get dimensions of the second matrix
        System.out.print("\nEnter the number of rows and columns for the second matrix (separated by space): ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();

        // Validate dimensions (optional)
        if (rows2 < 1 || rows2 > 100 || cols2 < 1 || cols2 > 100) {
            System.err.println("Error: Invalid dimensions for second matrix. Please enter values between 1 and 100.");
            return;
        }

        // Validate dimensions for addition (optional)
        if (rows1 != rows2 || cols1 != cols2) {
            System.err.println("Error: Matrices must have the same dimensions for addition.");
            return;
        }

        // Initialize the second matrix
        int[][] matrix2 = new int[rows2][cols2];

        // Get input for the second matrix
        System.out.println("\nEnter elements for the second matrix (each row separated by newline):");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Add corresponding elements of the matrices and store in a new matrix
        int[][] result = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the resultant matrix
        System.out.println("\nResultant matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        scanner.close();
    }
}
