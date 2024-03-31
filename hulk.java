import java.util.Scanner;

public class hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String feeling = "I hate";
        for (int i = 2; i <= n; i++) {
            feeling += " that I " + (i % 2 == 0 ? "love" : "hate");
        }
        feeling += " it";
        System.out.println(feeling);
    }
}

