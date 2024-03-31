import java.util.Scanner;

public class buyingbannana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // cost of first banana
        int n = sc.nextInt(); // initial dollars
        int w = sc.nextInt(); // number of bananas needed
        sc.close();
        
        int totalCost = 0;
        for (int i = 1; i <= w; i++) {
            totalCost += i * k; // cost of i-th banana
        }
        
        int borrow = Math.max(0, totalCost - n); // amount to borrow
        System.out.println(borrow);
    }
}
