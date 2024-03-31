import java.util.Scanner;

public class translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();
        String reversedString = new StringBuilder(originalString).reverse().toString();
        String inputString = scanner.nextLine();

        if (inputString.equals(reversedString)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


