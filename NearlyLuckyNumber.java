import java.util.Scanner;

public class NearlyLuckyNumber {
    // Check if a given number is nearly lucky
    public static boolean isNearlyLucky(long n) {
        int count = 0;
        while (n != 0) {
            // Count the number of lucky digits (4's and 7's)
            if (n % 10 == 4 || n % 10 == 7) {
                count++;
            }
            // Move to the next digit
            n /= 10;
        }
        // Check if the count of lucky digits is a lucky number
        return count == 4 || count == 7 || count == 44 || count == 47 || count == 74 || count == 77 || count == 444 || count == 447 || count == 474 || count == 477 || count == 744 || count == 747 || count == 774 || count == 777;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        // Check if the given number is nearly lucky
        if (isNearlyLucky(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

