// calculate digit product and its count of multiplies

public class sol20 {
    public static void main(String[] args){
        int num = 12345;
        int product = 1;
        int count = 0;

        while (num > 0){
            product = product * (num%10);
            count++;
            num = num/10;
        }
        System.out.println(" product of digit = "+ product);
        System.out.println(" count = "+ count);
    }
}