import java.util.*;

public class    HelpfullMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] nums = s.split("\\+");
        Arrays.sort(nums);
        System.out.println(String.join("+", nums));
        sc.close();
    }
}
