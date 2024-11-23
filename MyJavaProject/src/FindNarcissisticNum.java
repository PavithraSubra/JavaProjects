import java.util.Scanner;

public class FindNarcissisticNum {

    public static void main(String[] args) {
        

       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();
        
        if (isNarcissistic(number)) {
            System.out.println(number + " is a Narcissistic number.");
        } else {
            System.out.println(number + " is not a Narcissistic number.");
        }
        
        scanner.close();
    }
    
    public static boolean isNarcissistic(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = countDigits(number);
        
        while ( number >= 1 ) {
            int digit = number % 10;
            System.out.println(digit);
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }
    
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
}


