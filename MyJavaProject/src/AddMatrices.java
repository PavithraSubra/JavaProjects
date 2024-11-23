import java.util.Scanner;

public class AddMatrices {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the dimensions
        int maxRow = scanner.nextInt();
        int maxCol = scanner.nextInt();
        // Declare and create a 3D array of integers based on user input
        
        int[][][] arr1 = new int[maxRow][maxCol][maxCol];
        int[][][] arr2 = new int[maxRow][maxCol][maxCol];
  
       // String test = scanner.nextLine();
        // Get user input for array elements
      //  System.out.println("Enter the elements of the 3D array:");
    //  if( (maxRow > 1 && maxRow < 100) && (maxCol > 1 && maxCol < 100 )  )
     // {
        
               //first array
               scanner.nextLine();
                    for (int i = 0; i < maxRow; i++) {
                        for (int j = 0; j < maxRow; j++) {
                            for (int k = 0; k < maxCol; k++) {
                            //  System.out.print("Element at position [" + i + "][" + j + "][" + k + "]: ");
                                arr1[i][j][k] = scanner.nextInt();
                            }
                            scanner.nextLine();
                        }
                        scanner.nextLine();
                    }

                    /*
                    System.out.print("Second array"); 
                    int maxRow2 = scanner.nextInt();
                    int maxCol2 = scanner.nextInt();
                    //second array
                    for (int i = 0; i < maxRow2; i++) {
                        for (int j = 0; j < maxRow2; j++) {
                            for (int k = 0; k < maxCol2; k++) {
                            //  System.out.print("Element at position [" + i + "][" + j + "][" + k + "]: ");
                                arr2[i][j][k] = scanner.nextInt();
                            }
                            
                        }
                    }

                               
                // Add corresponding elements of the arrays and store in a new 3D array
                int[][][] sum = new int[maxRow][maxCol][maxCol];
                for (int i = 0; i < maxRow; i++) {
                    for (int j = 0; j < maxCol; j++) {
                        for (int k = 0; k < maxCol; k++) {
                            sum[i][j][k] = arr1[i][j][k] + arr2[i][j][k];
                        }
                    }
                }

                // Print the sum of the 3D arrays
                System.out.println("\nSum of the arrays:");
                for (int i = 0; i < maxRow; i++) {
                    for (int j = 0; j < maxCol; j++) {
                        for (int k = 0; k < maxCol; k++) {
                            System.out.print(sum[i][j][k] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                    */
                    System.out.print("Printing array");
                    for (int i = 0; i < maxRow; i++) {
                        for (int j = 0; j < maxCol; j++) {
                            for (int k = 0; k < maxCol; k++) {
                                System.out.print(arr1[i][j][k] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                    scanner.close();

        }
       // }

        
    }



