import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class horseshoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] colors = new int[4];
        for (int i = 0; i < 4; i++) {
            colors[i] = sc.nextInt();
        }
        Set<Integer> uniqueColors = new HashSet<>();
        for (int color : colors) {
            uniqueColors.add(color);
        }
        int numColorsToBuy = 4 - uniqueColors.size();
        System.out.println(numColorsToBuy);
    }
}
