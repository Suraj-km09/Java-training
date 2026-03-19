
public class sol46 {
    public static void main(String[] args) {
        int num = 1234;
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        while (rev > 0) {
            System.out.print(rev % 10 + " ");
            rev /= 10;
        }
    }
}