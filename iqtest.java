import java.util.Scanner;

public class iqtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num;
        int last_odd = 0, last_even = 0;
        int even = 0;

        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            if (num % 2 == 0) {
                even += 1;
                last_even = i + 1;
            } else {
                even -= 1;
                last_odd = i + 1;
            }
        }

        System.out.println(even > 0 ? last_odd : last_even);
    }
}

