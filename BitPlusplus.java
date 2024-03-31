import java.util.Scanner;
public class BitPlusplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;

        for (int i = 0; i < n; i++) {
            String statement = sc.next();
            if (statement.charAt(0) == '+' || statement.charAt(2) == '+') {
                x++;
            } else {
                x--;
            }
        }

        System.out.println(x);
    }
}

