import java.util.Scanner;

public class ReverseCalculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int reversed = reverseCalculator(number);
        System.out.println("Number is reversed :" +reversed);
        
      scanner.close();

    }

    public static int reverseCalculator(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Add digit to reversed (shifted)
            num /= 10; // Remove the last digit from the original number
        }
        return reversed;
    }

}
