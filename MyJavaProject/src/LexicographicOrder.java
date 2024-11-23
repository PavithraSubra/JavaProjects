import java.util.Arrays;
import java.util.Scanner;

public class LexicographicOrder {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of words from the user
        System.out.print("Enter the number of words: ");
        int numWords = scanner.nextInt();

        // Create an array to store the words
        String[] words = new String[numWords];

        // Get the words from the user
        System.out.println("Enter " + numWords + " words (one per line):");
        for (int i = 0; i < numWords; i++) {
            words[i] = scanner.nextLine().trim(); // Read and trim leading/trailing whitespaces
        }

        // Sort the words lexicographically (dictionary order)
        Arrays.sort(words);

        // Print each word on a separate line
        System.out.println("\nWords in lexicographical order:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}



