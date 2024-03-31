import java.util.*;
import java.util.Arrays;
public class waytoolongword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character left over from nextInt()

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            if (word.length() > 10) {
                word = abbreviate(word);
            }
            System.out.println(word);
        }

        scanner.close();
    }

    private static String abbreviate(String word) {
        int numLetters = word.length() - 2;
        return word.charAt(0) + Integer.toString(numLetters) + word.charAt(word.length() - 1);
    }

 }
    
