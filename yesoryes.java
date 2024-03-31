import java.util.Scanner;

public class yesoryes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for(int i=0;i<c;i++){
            String s = sc.next();
            int si = s.length();
            for(int j=0;j<si;j++){
                if(s.charAt(j)>'A' && s.charAt(j)<'Z' ){
                    s = s.substring(0,j) + (char)(s.charAt(j)+32) + s.substring(j+1);
                }
            }
            if(s.equals("yes")){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
