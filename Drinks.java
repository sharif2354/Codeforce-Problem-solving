import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read the integer n
        int n = scanner.nextInt();

        // read n integers and store them in an array
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // print the sum of the integers
        double sum = 0;
        double avarage = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
             avarage = sum/n;
        }
        System.out.println(avarage);
        
    }
}
