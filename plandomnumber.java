public class plandomnumber {
    public static void main(String[] args) {
        
        int x = 121 , remainder,reversed=0;
        int original = x;
        
        while(x != 0){
           remainder = x%10;
           reversed = reversed * 10 + remainder;
           x/=10;
          
        }
        if(original==reversed)
        System.out.println(true);
        else
        System.out.println(false);

    }
}
