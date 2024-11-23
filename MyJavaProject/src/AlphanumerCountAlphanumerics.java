import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlphanumerCountAlphanumerics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an alphanumeric string:");
        String input = scanner.nextLine();

        // Create a map to store counts of each alphabet and each number
        Map<Character, Integer> alphabetCountMap = new HashMap<>();
        Map<Character, Integer> numberCountMap = new HashMap<>();

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is an alphabet
            if (Character.isLetter(ch)) {
                alphabetCountMap.put(ch, alphabetCountMap.getOrDefault(ch, 0) + 1);
            }
            // Check if the character is a digit
            else if (Character.isDigit(ch)) {
                numberCountMap.put(ch, numberCountMap.getOrDefault(ch, 0) + 1);
            }
            // Ignore other characters like symbols, spaces, etc.
        }

        // Print counts of each alphabet
        System.out.println("Counts of each alphabet:");
        for (char ch : alphabetCountMap.keySet()) {
            System.out.println(ch + ": " + alphabetCountMap.get(ch));
        }

        // Print counts of each number
        System.out.println("\nCounts of each number:");
        for (char ch : numberCountMap.keySet()) {
            System.out.println(ch + ": " + numberCountMap.get(ch));
        }

        scanner.close();
    }
}
