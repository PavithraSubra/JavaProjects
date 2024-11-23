import java.util.Scanner;

public class ArrayFindLargest {

    
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        int arraylen = scanner.nextInt();
        int [] arrayElem = new int [arraylen];
        for (int i=0; i<arraylen ; i++)
        {
         arrayElem[i] = scanner.nextInt();
        }
        if ((arraylen > 3 )&& (arraylen <=1000 ) && (arrayElem.length == arraylen))
        {
         int largNum = findLargest(arrayElem);
        System.out.println(largNum);
        }
        
        scanner.close();
    }
    
    public static int findLargest(int [] array) {
        int firstmax = array[0];
        int secondmax = array[1];
        int thirdmax = array[2];

        for (int num=1; num < array.length ; num++) 
        {
            if (array[num] > firstmax) {
                thirdmax = secondmax;
                secondmax = firstmax;
                firstmax = array[num];
            } 
            else if (array[num] > secondmax && array[num] != firstmax) {
                thirdmax = secondmax;
                secondmax = array[num];
            } 
            else if (array[num] > thirdmax && array[num] != secondmax && array[num] != firstmax) {
                thirdmax = array[num];
            }
        }

        return thirdmax;

    }
/*

        int firstmax = array[0];
        int secondmax = 
        int count=0;
        int thirdMax = max;
        for(int i=0; i<array.length; i++)
        {
            if(array[i]>max)
            {
                max = array[i];
                count++;
                System.out.println(count);
                System.out.println(max);
            }
            if(count == 2)
            {   
                thirdMax = array[i];
             //   System.out.println("thirdMax" +thirdMax;
            }
        }
       // System.out.println(thirdMax);
        return max;
    }
*/
}
