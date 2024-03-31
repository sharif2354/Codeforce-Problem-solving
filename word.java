import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                uppercaseCount++;
            } else {
                lowercaseCount++;
            }
        }
        if (uppercaseCount > lowercaseCount) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}
