// check palindrome

public class sol35 {
    public static void main(String[] args){
        int num = 12345;
        int original = num;
        int rev = 0;
        while (num > 0){
            rev = rev*10 + (num%10);
            num = num/10;
        }
        if (rev == original){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}