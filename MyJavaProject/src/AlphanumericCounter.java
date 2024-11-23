import java.util.Scanner;

public class AlphanumericCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an alphanumeric string:");
        String input = scanner.nextLine();

        int alphabetCount = 0;
        int numberCount = 0;

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is an alphabet
            if (Character.isLetter(ch)) {
                alphabetCount++;
            }
            // Check if the character is a digit
            else if (Character.isDigit(ch)) {
                numberCount++;
            }
            // Ignore other characters like symbols, spaces, etc.
        }

        System.out.println("Number of alphabets: " + alphabetCount);
        System.out.println("Number of numbers: " + numberCount);

        scanner.close();
    }
}
