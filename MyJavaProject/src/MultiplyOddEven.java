import java.util.Scanner;

public class MultiplyOddEven {

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
            
                result = MultiplyOddEvenAfterSum(arraylen, arrayElem);    
                  
            }

        System.out.println(result);     
        
        scanner.close();
    }
    public static int MultiplyOddEvenAfterSum(int arrlen, int [] array) {

        int evenSum=0;
        int oddSum=0;

        for (int i=0; i<arrlen ; i++)
        {           
            if(array[i] % 2 == 0) 
            {
                System.out.println("Even");
                System.out.println(array[i] );
                evenSum = evenSum + array[i]; 
                
            }
            else if((array[i] % 2) != 0)
            {
                
                System.out.println("Odd");
                System.out.println(array[i] );
                oddSum = oddSum + array[i]; 
                
                
            }
           
        }
        return (evenSum * oddSum);
    }    

}
