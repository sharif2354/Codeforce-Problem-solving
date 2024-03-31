import java.util.Scanner;

public class NextRound {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();
int[] scores = new int[n];
for (int i = 0; i < n; i++) {
scores[i] = sc.nextInt();
}
int advancers = 0;
int kthScore = scores[k - 1];
for (int i = 0; i < n; i++) {
if (scores[i] >= kthScore && scores[i] > 0) {
advancers++;
} else {
break;
}
}
System.out.println(advancers);
}
}
