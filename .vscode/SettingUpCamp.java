import java.util.Scanner;

public class SettingUpCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt(); // Number of introverts
            int b = scanner.nextInt(); // Number of extroverts
            int c = scanner.nextInt(); // Number of universals

            int totalIntrovertsTents = a;
            int totalExtrovertsTents = b / 2; // Each extrovert needs a tent shared with two others

            int totalTents = totalIntrovertsTents + totalExtrovertsTents;

            // Check if introverts can be accommodated
            if (totalIntrovertsTents > totalTents) {
                System.out.println(-1);
                continue;
            }

            // Calculate remaining tents after accommodating introverts and extroverts
            int remainingTents = totalTents - totalIntrovertsTents;

            // Distribute remaining tents among universals
            totalTents += Math.min(c, remainingTents);

            // Calculate additional tents needed for remaining universals
            int remainingUniversals = Math.max(0, c - remainingTents);
            int additionalTents = (remainingUniversals + 2) / 3;

            // Total tents needed
            totalTents += additionalTents;

            System.out.println(totalTents);
        }
    }
}
