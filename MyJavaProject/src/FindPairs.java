import java.util.Scanner;

public class FindPairs {
    
    public static void main(String args[] ) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int arraylen = scanner.nextInt();
        int [] arrayElem = new int [arraylen];
        for (int i=0; i<arraylen ; i++)
        {
         arrayElem[i] = scanner.nextInt();
        }
        int findPairNum = scanner.nextInt();
        int result=0;
        if(((arraylen > 1) && (findPairNum > 1)) &&
        (arraylen < (Math.pow(10,5))) &&
        (findPairNum < (Math.pow(10,5))) )
        {
          
            result = FindPairNum(arraylen, arrayElem, findPairNum);           
        }
        System.out.println(result);
        scanner.close();
    }
    private static int FindPairNum(int arraylen, int arrayElem[],  int findPairNum) {
        // Find Minimum of a and b
        int [] sum = new int[ arraylen];
        int result = 0;
        for(int i=0; i<arrayElem.length ; i++ )
        {
            sum[i] = arrayElem[i] + arrayElem[i+1] ;
            if( sum[i] == findPairNum)
            {
                result = 1;
                System.out.println(sum[i]);
            }
        }

        // Return gcd of a and b
        return result;

    }
}
