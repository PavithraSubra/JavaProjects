import java.util.Scanner;

public class TransposeMatrices {

        public static void main(String[] args) {

            
                     
          Scanner scanner = new Scanner(System.in);
        
          int maxRow = scanner.nextInt();
          int maxCol = scanner.nextInt();
                      
            
          int[][] original = new int[maxRow][maxCol];
          
          int[][] transpose = new int[maxRow][maxCol];
          if((( maxRow != 0 ) && (maxRow < 100)) && 
          ((maxCol !=0 ) && (maxCol < 100 )) )
          {
          
              for (int i = 0; i < maxRow; i++) 
              {
                  for (int j = 0; j < maxCol; j++) 
                  {
                      original[i][j] = scanner.nextInt();
                  }
              }
  
              for (int i = 0; i < maxRow; i++) 
              {
                  for (int j = 0; j < maxCol; j++) 
                  {
                      transpose[j][i] = original[i][j];
                  }
              }
          }
          System.out.println();
        
          for (int i = 0; i < maxRow; i++) 
          {
              for (int j = 0; j < maxCol; j++) 
              {
                  System.out.print(transpose[i][j] + " ");
              }
                  System.out.println();
          }
  
            scanner.close();
      }
        
      

}
