import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class wordcapitalization {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char firstChar = Character.toUpperCase(s.charAt(0));
    String capitalizedWord = firstChar + s.substring(1);

    System.out.println(capitalizedWord);
    

    }

    
}
