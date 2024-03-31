import java.util.Scanner;

public class Dominofiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int maxDominoes = (m * n) / 2;
        System.out.println(maxDominoes);
    }
}
