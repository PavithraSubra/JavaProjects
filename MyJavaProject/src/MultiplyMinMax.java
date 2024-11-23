import java.util.Scanner;

public class MultiplyMinMax {

    public static void main(String args[] ) throws Exception {
     Scanner scanner = new Scanner(System.in);
        int arraylen = scanner.nextInt();
        int [] arrayElem = new int [arraylen];
        int result=0;
        for (int i=0; i<arraylen ; i++)
        {
            arrayElem[i] = scanner.nextInt();
        }

            
            if((arraylen > 1) && (arraylen < (Math.pow(10,5))))
            {
            
                result = FindMinMax(arraylen, arrayElem);    
                  
            }

        System.out.println(result);     
        
        scanner.close();
    }
    public static int FindMinMax(int arrlen, int [] array) { 

        int minNum=0;
        int maxNum=0;

        minNum = array[0];
        for (int i=0; i<arrlen ; i++)
        {           
            minNum = Math.min(minNum, array[i]);           
        }
        maxNum = array[0];
        for (int i=0; i<arrlen ; i++)
        {           
            maxNum = Math.max(maxNum, array[i]);           
        }


        return (minNum * maxNum);
    } 


}