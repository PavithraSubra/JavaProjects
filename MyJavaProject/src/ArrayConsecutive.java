import java.util.Scanner;

public class ArrayConsecutive {

    
    
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
        
            result = CheckIfConsec(arraylen, arrayElem);                
        }

        if (result==1)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
       
        scanner.close();
    }
    
    public static int CheckIfConsec(int arrlen, int [] array) {
    
        int diff=0;
        int check=0;
        int temp=0;
        for (int i = 0; i < arrlen; i++) 
        {
            for (int j = i + 1; j < arrlen; j++) 
            {
                if (array[i] > array[j]) 
                {
                    temp = array[i];
                    array[i] =array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < arrlen; i++) 
        {
            for (int j = i + 1; j < arrlen; j++) 
            {
                diff = array[j] - array[i];
                if( diff == 1)
                {
                    check=1;
                }
                else
                {
                    check=0;
                }
            }
        }
        return check;

    }


}

