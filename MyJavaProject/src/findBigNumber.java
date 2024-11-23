import java.util.Scanner;

public class findBigNumber {
    public static void main(String args[] ) throws Exception {

           Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = findBigNum(number);

        System.out.println(result);
        scanner.close();

   }

   private static int findBigNum(int number)
   {
       int count =1;
       for(int i=0; number!=0; i++)
       {
           number = number/10;
           count++;
           System.out.println(count);
       }
       return count;

   }
}
