import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class findlargestnumber {
   public static void main(String[] args) {
    System.out.println("Enter your array index number: ");
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int[] array = new int[length];
    System.out.println("Enter array input is: ");
    for(int i = 0; i<length; i++){
        System.out.println(" ENTERED ELEMENT IS "+ i+ " ");
        array[i]=sc.nextInt();
        
    }
    for(int i = 0; i<length; i++)
        {
            System.out.println(array[i]);
        }
   } 
   if()
}
