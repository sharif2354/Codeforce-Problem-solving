import java.util.Scanner;

public class capslock{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int sayac = 0;
        
        for(int i=0; i<n; i++) {
            if(s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                sayac++;
            }
        }
        
        if((sayac == n-1 && (s.charAt(0) <= 'z' && s.charAt(0) >= 'a')) || sayac == n) {
            StringBuilder sb = new StringBuilder(s);
            for(int i=0; i<n; i++) {
                if(s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                    sb.setCharAt(i, (char)(s.charAt(i) - 'A' + 'a'));
                } else {
                    sb.setCharAt(i, (char)(s.charAt(i) - 'a' + 'A'));
                }
            }
            s = sb.toString();
        }
        
        System.out.println(s);
        sc.close();
    }
}
