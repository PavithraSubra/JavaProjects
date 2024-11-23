import java.util.Arrays;
import java.util.Scanner;

public class DiagAddMatrix {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the dimensions
        int maxRow = scanner.nextInt();
        int maxCol = scanner.nextInt();
        // Declare and create a 3D array of integers based on user input
        
        int[][] arr1 = new int[maxRow][maxCol];
        int [] diag1 = new int[maxRow];
        int [] diag2 = new int[maxRow];
        int countDiag1=0,countDiag2=0;
        int sumDiag1 =0, sumDiag2=0, result=0;

        for(int i=0; i<maxCol; i++) {
            for(int j=0; j<maxRow; j++) {
                arr1[i][j] = scanner.nextInt();
                if((i==0 && j==0) || (i==1 && j==1) || (i==2 && j==2) )
                {
                    
                    while(countDiag1<maxCol)
                    {
                        diag1[countDiag1] = arr1[i][j];
                        countDiag1++;
                        break;
                    }
                    
                }
                if((i==2 && j==0) || (i==1 && j==1) || (i==0 && j==2) )
                {
                    
                    while(countDiag2<maxCol)
                    {
                        diag2[countDiag2] = arr1[i][j];
                        countDiag2++;
                        break;
                    }
                    
                }
            }
         }
        
       
        for(int m=0; m<maxCol; m++)
        {
            sumDiag1 += diag1[m];
        }
        for(int m=0; m<maxCol; m++)
        {
            sumDiag2 += diag2[m];
        }
        if(sumDiag1 > sumDiag2)
        {
            for(int l=0; l<maxCol; l++)
            {
                System.out.print(diag1[l]+" ");
            }
        }
        else if(sumDiag2 > sumDiag1)
        {
            for(int l=0; l<maxCol; l++)
            {
                System.out.print(diag2[l]+" ");
            }
        }
        else if (sumDiag1 == sumDiag2)
        {
            System.out.print("Equal");
        }
        
        scanner.close();

     }

}
