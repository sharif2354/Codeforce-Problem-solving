import java.util.Scanner;

public class softdrinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values
        int n = sc.nextInt(); // number of friends
        int k = sc.nextInt(); // number of bottles of drink
        int l = sc.nextInt(); // milliliters of drink in each bottle
        int c = sc.nextInt(); // number of limes
        int d = sc.nextInt(); // number of slices in each lime
        int p = sc.nextInt(); // grams of salt
        int nl = sc.nextInt(); // milliliters of drink needed for each toast
        int np = sc.nextInt(); // grams of salt needed for each toast

        // Calculate maximum number of toasts that can be made
        int ml = k * l; // total milliliters of drink
        int slices = c * d; // total number of lime slices
        int salt = p; // total grams of salt
        int maxToasts = Math.min(Math.min(ml / nl, slices), salt / np);

        // Calculate number of toasts per friend
        int toastsPerFriend = maxToasts / n;

        // Print result
        System.out.println(toastsPerFriend);
    }
}

