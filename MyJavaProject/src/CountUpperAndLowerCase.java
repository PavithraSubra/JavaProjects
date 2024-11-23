import java.util.Scanner;

public class CountUpperAndLowerCase {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an alphanumeric string:");
        String input = scanner.nextLine();

        int alphabetUpperCount = 0;
        int alphabetLowerCount = 0;

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is an alphabet
            if (Character.isLetter(ch)) {
                if(ch >= 'A' && ch <='Z')
                {
                    alphabetUpperCount++;
                }
                if(ch >= 'a' && ch <='z')
                {
                    alphabetLowerCount++;
                }
                
            }
            // Check if the character is a digit
            else if (Character.isDigit(ch)) {
               return;
            }
            // Ignore other characters like symbols, spaces, etc.
        }

        System.out.println("Number of  Upper case alphabets: " + alphabetUpperCount);
        System.out.println("Number of Lower case alphabets: " +  alphabetLowerCount);
        

        scanner.close();

    }
}