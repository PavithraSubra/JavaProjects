import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class RowAddMatrix {

    
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the dimensions
        int maxRow = scanner.nextInt();
        int maxCol = scanner.nextInt();
        // Declare and create a 3D array of integers based on user input
        
        int[][] arr1 = new int[maxRow][maxCol];
        int [] row = new int[maxRow];
        ArrayList<Integer> resultArr = new ArrayList<Integer>();
        
        int sumRow =0, sumRow2=0, sumRow3=0, result=0;
        int iteration=0;
        for(int i=0; i<maxRow; i++) {
            sumRow =0;
            for(int j=0; j<maxCol; j++) {
                arr1[i][j] = scanner.nextInt();
                sumRow = sumRow + arr1[i][j];
                
            }
            row[i] = sumRow;

         }
         for(int k=0; k<maxRow; k++ )
         {
             resultArr.add(row[k]);                 
         }
         
        
        Collections.sort(resultArr, Collections.reverseOrder());
        
        int count=0;
        
        for(int m=0; m<maxRow ; m++)
        {
            if (resultArr.get(count) == row[m])
            {
                System.out.println("Row " + (m+1));
                break;
            }
            else
            {
                continue;
            }
        }


        scanner.close();

     }

}
