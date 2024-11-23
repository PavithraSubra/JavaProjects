import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Reverse the number
       // int reversed = reverseNumberWhileLoop(number);
       // int reversed = reverseNumberForLoop(number);

       int reversed =  reverseNumberDoWhileLoop (number);
        System.out.println("The reversed number is: " + reversed);
        scanner.close();
    }

    // Function to reverse the number using while loop
   /*  public static int reverseNumberWhileLoop(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Add digit to reversed (shifted)
            num /= 10; // Remove the last digit from the original number
        }
        return reversed;
    }*/

    /*public static int reverseNumberForLoop(int num) {
        int reversed = 0;
        for ( ; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        return reversed;
    }*/
    public static int reverseNumberDoWhileLoop(int num) {
        int reversed = 0;
       do 
       {
        
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;

       }while (num!=0);

        return reversed;
    }
}
