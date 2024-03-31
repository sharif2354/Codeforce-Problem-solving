
import java.util.Arrays;
import java.util.Scanner;

public class AlyonaandMex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int present = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] >= present) {
                present++;
            }
        }
        System.out.println(present);
    }
}


