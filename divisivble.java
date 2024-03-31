import java.util.Scanner;

public class divisivble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int rem = a % b;
            if (rem == 0) {
                System.out.println(0);
            } else {
                System.out.println(b - rem);
            }
        }
        scanner.close();
    }
}
