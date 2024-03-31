import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
public class Elepent {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int x = sc.nextInt();
        int steps = (x / 5) + ((x % 5 == 0) ? 0 : 1);
        System.out.println(steps);
    }
    
}
