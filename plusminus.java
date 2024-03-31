
import java.util.Scanner;
public class plusminus {
    public static void main(String[] args) {
        int n,k;
        Scanner sc = new Scanner(System.in);
         n = sc. nextInt();
         k= sc.nextInt();
         for(int i = 0; i<k; i++){
            if(n%10 ==0){
                n /=10;
            }
            else{
                n--;

            }
            System.out.println(n);
         }


    }
    
    }
    
