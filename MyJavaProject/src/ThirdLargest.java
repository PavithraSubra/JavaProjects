import java.util.Scanner;

public class ThirdLargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int thirdMax = findLargest(arr);
        if (thirdMax != -1) {
            System.out.println(thirdMax);
        } 
        else {
            System.out.println("The length of the array should not be less than 3");
        }
        scanner.close();
  }

  private static int findLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) 
        {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } 
            else if (num > second && num != first) {
                third = second;
                second = num;
            } 
            else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        return third;
  }
}



