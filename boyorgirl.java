import java.util.*;

public class boyorgirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        Set<Character> uniqueChars = new HashSet<Character>();
        for (char c : username.toCharArray()) {
            uniqueChars.add(c);
        }
        if (uniqueChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
