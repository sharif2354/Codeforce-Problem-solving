import java.util.Scanner;

public class hitthelottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = scanner.nextInt();

        int[] denominations = {100, 20, 10, 5, 1}; // available bill denominations
        int count = 0;

        for (int denomination : denominations) {
            count += balance / denomination; // count how many bills can be used
            balance %= denomination; // get the remaining balance
        }

        System.out.println(count);
    }
}

