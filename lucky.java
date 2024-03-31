import java.util.Scanner;

public class lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of test cases
        sc.nextLine(); // consume the newline after t

        for (int i = 0; i < n; i++) {
            String ticket = sc.nextLine();
            int sum1 = ticket.charAt(0) + ticket.charAt(1) + ticket.charAt(2);
            int sum2 = ticket.charAt(3) + ticket.charAt(4) + ticket.charAt(5);
            if (sum1 == sum2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
