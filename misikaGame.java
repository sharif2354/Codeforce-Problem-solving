import java.util.Scanner;

public class misikaGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mScore = 0, cScore = 0; // scores for Mishka and Chris
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt(); // Mishka's score in the i-th round
            int c = sc.nextInt(); // Chris's score in the i-th round
            if (m > c) {
                mScore++;
            } else if (c > m) {
                cScore++;
            }
        }
        if (mScore > cScore) {
            System.out.println("Mishka");
        } else if (cScore > mScore) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
        sc.close();
    }
}

