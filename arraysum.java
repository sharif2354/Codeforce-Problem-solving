import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class arraysum{
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter Number of integer: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] array = new int[length];
        System.out.println("integer number is: ");
        for(int i = 0; i<length; i++){
            System.out.println("integer is :" + i+ " ");
            array[i] = scanner.nextInt();
        }
        System.out.println("the integer number is : ");
        for(int i = 0; i<array.length; i++)
        {

            sum +=array[i];
            
            
        }
        System.out.println(sum);
    }
}
