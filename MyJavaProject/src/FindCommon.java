import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindCommon {


    public static void main(String args[] ) throws Exception {
        
        
        Scanner scanner = new Scanner(System.in);
        int arraylen1 = scanner.nextInt();
        
        int [] arrayElem1 = new int [arraylen1];
        for (int j=0; j < arraylen1 ; j++) 
        {
            arrayElem1[j] = scanner.nextInt();
        }
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for(int i=0; i<arraylen1; i++ )
        {
            arr1.add(arrayElem1[i]);                 
        }
        int arraylen2 = scanner.nextInt();
        
        int [] arrayElem2 = new int [arraylen2];
        for (int j=0; j < arraylen2 ; j++) 
        {
            arrayElem2[j] = scanner.nextInt();
        }
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i=0; i<arraylen2; i++ )
        {
                arr2.add(arrayElem2[i]);           
        }
        arr1.retainAll(arr2);
        /*
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        int count=0;
        for(int k=0; k<arraylen1; k++)
        {
            for(int l=0; l<arraylen2; l++)
            {
                if((arrayElem1[k] == arrayElem2[l] ) && count<=1)
                {
                    myNumbers.add(arrayElem1[k]);
                    count++;
                }
                else{
                    continue;
                }
            }

        }
        
        Collections.sort(myNumbers);
        System.out.println(myNumbers);
        */
        System.out.println(arr1);
        scanner.close();
    }
}
