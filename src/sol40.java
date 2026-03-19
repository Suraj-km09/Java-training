// find smallest digit and return its position

public class sol40 {
    public static void main(String[] args){
        int num = 12845;
        int min = 9, pos = 1, minPos = 1;
        while (num > 0){
            int digit = num%10;
            if ( digit < min){
                min = digit;
                minPos = pos;
            }
            pos++;
            num = num/10;
        }
        System.out.println("min digit = " + min);
        System.out.println("Position (from right) = " + minPos);
    }
}