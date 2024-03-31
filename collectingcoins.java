import java.util.Scanner;
public class collectingcoins{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int n = scanner.nextInt();
            int k = (a + b + c + n) / 3;
            if (n + (a + b + c) % 3 == 0 && n >= k - a && n >= k - b && n >= k - c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
}
}