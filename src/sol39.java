// smallest digit in a number

public class sol39 {
    public static void main(String[] args){
        int num = 12845;
        int min = 9;
        while (num > 0){
            int digit = num%10;
            if ( digit < min){
                min = digit;
            }
            num = num/10;
        }
        System.out.println("max digit = " + min);
    }
}