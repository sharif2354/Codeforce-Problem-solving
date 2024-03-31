import java.util.*;
public class insertdigit {
  

    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t-- > 0) {
    int n = scanner.nextInt();
    int d = scanner.nextInt();
    String s = scanner.next();
    StringBuilder sb = new StringBuilder();
    boolean inserted = false;
    for (int i = 0; i < n; i++) {
    if (!inserted && s.charAt(i) < d + '0') {
    sb.append((char) (d + '0'));
    inserted = true;
    }
    sb.append(s.charAt(i));
    }
    if (!inserted) {
    sb.append((char) (d + '0'));
    }
    System.out.println(sb.toString());
    }
    }
    }  

