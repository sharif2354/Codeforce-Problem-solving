import java.lang.*;
import java.util.*;
 
public class Main{
    public static void main(String args[]){
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0){
            int n;
            n=sc.nextInt();
            int even=0;
            int odd=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x%2==0){
                    even+=x;
                }else odd+=x;
            }
            if(even<=odd){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                
            }
            t--;
        }
    }
}