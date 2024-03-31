import java.util.Scanner;

public class ultrafastmathmatician {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read the two binary strings
        
        String binaryString1 = scanner.nextLine();
        String binaryString2 = scanner.nextLine();

        // check that the two strings have the same length
        if (binaryString1.length() != binaryString2.length()){
            return;
        }

        // perform the bitwise XOR operation on the two strings
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < binaryString1.length(); i++) {
            char c1 = binaryString1.charAt(i);
            char c2 = binaryString2.charAt(i);
            if (c1 != c2) {
                result.append('1');
            } else {
                result.append('0');
            }
        }

        // print the result
        System.out.println( result.toString());
    }
}
