import java.util.Scanner;

public class SumOfAvg {

    
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
        
            result = MultiplySumOfAvg(arraylen, arrayElem);    
                
        }

        System.out.println(result);     
        
        scanner.close();
    }

    public static int MultiplySumOfAvg(int arrlen, int [] array) {

        int evenSum=0;
        int oddSum=0;
        int evenAvg=0, evenCount=0;
        int oddAvg=0, oddCount=0;

        for (int i=0; i<arrlen ; i++)
        {           
            if(array[i] % 2 == 0) 
            {
                evenSum = evenSum + array[i]; 
                evenCount++;
                
            }
            else if((array[i] % 2) != 0)
            {
                oddSum = oddSum + array[i]; 
                oddCount++;                
            }
            
           
        }
        evenAvg=Math.round(evenSum/evenCount);
        oddAvg=Math.round(oddSum/oddCount);
        return (evenAvg + oddAvg);
    }    

}
