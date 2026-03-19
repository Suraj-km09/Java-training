// find largest digit and its count

public class sol38 {
    public static void main(String[] args){
        int num = 12845;
        int temp = num;
        int max = 0;
        int count = 0;

        while (num > 0){
            int digit = num%10;
            if ( digit > max){
                max = digit;
            }
            num = num/10;
        }

        while (temp > 0){
            int digit = temp%10;
            if ( digit == max){
                count++;
            }
            temp = temp/10;
        }
        System.out.println("max digit = " + max);
        System.out.println("count = " + count);
    }
}