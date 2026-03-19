// product of digit of number

public class sol19 {
    public static void main(String[] args){
        int num = 1234;
        int product = 1;

        while (num > 0){
            product = product * (num%10);
            num = num/10;
        }
        System.out.println(" product of digit = "+ product);
    }
}