import java.util.Scanner;

public class alarmclock {
    static final int N = 3_00_005, M = 3_00_005;
    static int n, m;
    static long[] x = new long[N], p = new long[M];
    static long d;

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= n; ++i) {
            x[i] = sc.nextLong();
        }
        for (int i = 1; i <= m; ++i) {
            p[i] = sc.nextLong();
        }
        for (int i = 1; i < n; ++i) {
            d = gcd(d, x[i + 1] - x[i]);
        }
        for (int i = 1; i <= m; ++i) {
            if (d % p[i] == 0) {
                System.out.println("YES");
                System.out.printf("%d %d\n", x[1], i);
                return;
            }
        }
        System.out.println("NO");
    }
}
