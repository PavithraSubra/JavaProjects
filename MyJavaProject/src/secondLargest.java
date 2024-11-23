import java.util.Scanner;

public class secondLargest {

   
  public static void main(String[] args) {
        


    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int secondMax = findSecLargest(arr);
        if (secondMax <= Math.pow(10, 9) ) {
            System.out.println(secondMax);
        } 
        else {
            System.out.println("The length of the array should not be less than 3");
        }
        scanner.close();
}

public static int findSecLargest(int [] array) {
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

    return secondmax;

    }
}
