// find largest digit in a number

public class sol37 {
    public static void main(String[] args){
        int num = 12845;
        int max = 0;
        while (num > 0){
            int digit = num%10;
            if ( digit > max){
                max = digit;
            }
            num = num/10;
        }
        System.out.println("max digit = " + max);
    }
}