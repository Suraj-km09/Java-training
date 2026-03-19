// count digit also find sum of digit

public class sol32 {
    public static void main(String[] args){
        int num = 1234;
        int sum = 0;
        int count= 0;
        while (num > 0){
            sum+= num%10;
            num = num/10;
            count++;
        }
        System.out.println(" sum of digit = "+ sum);
        System.out.println(" count = "+ count);
    }
}