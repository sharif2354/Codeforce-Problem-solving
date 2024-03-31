import java.util.Scanner;

public class presents {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int[] pi = new int[n];
for (int i = 0; i < n; i++) {
pi[i] = scanner.nextInt() - 1;
}
int[] ans = new int[n];
for (int i = 0; i < n; i++) {
ans[pi[i]] = i + 1;
}
for (int i = 0; i < n; i++) {
System.out.print(ans[i] + " ");
}
}
}