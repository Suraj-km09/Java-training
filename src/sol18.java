// calculate sum of digit until the digit become single digit

public class sol18 {
    public static void main(String[] args){
        int num = 1234;
        int sum = 0;
        while (num > 1){
            sum+= num%10;
            num = num/10;
        }
        System.out.println(" sum of digit = "+ sum);
    }
}