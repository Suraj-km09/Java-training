// reverse and check if both are equal

public class sol34 {
    public static void main(String[] args){
        int num = 12345;
        int original = num;
        int rev = 0;
        while (num > 0){
            rev = rev*10 + (num%10);
            num = num/10;
        }
        if (rev == original){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        System.out.println("reverse of number = "+ rev);

    }
}