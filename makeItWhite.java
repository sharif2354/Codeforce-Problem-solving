import java.util.Scanner;

public class makeItWhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the strip
            scanner.nextLine(); // Consume the newline character
            String s = scanner.nextLine(); // The strip

            // Find the first and last occurrence of 'B'
            int firstBlack = s.indexOf('B');
            int lastBlack = s.lastIndexOf('B');

            // Calculate the minimum length of the segment to be painted
            int segmentLength = lastBlack - firstBlack + 1;
            System.out.println(segmentLength);
        }
        scanner.close();
    }
}
