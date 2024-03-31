import java.util.Scanner;

public class addoddorsubeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int diff = Math.abs(a - b);
            
            if (diff == 0) {
                System.out.println(0);
            } else if ((a < b && diff % 2 == 1) || (a > b && diff % 2 == 0)) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
