import java.util.Scanner;
import java.util.Arrays;

public class minimumdistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x); // sort the array to get the middle value
        int distance = x[2] - x[0]; // distance between the two outermost points
        System.out.println(distance);
        sc.close();
    }
}
