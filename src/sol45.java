
public class sol45 {
    public static void main(String[] args) {
        int num = 1234;

        while (num > 0) {
            System.out.print(num % 10 + " ");
            num /= 10;
        }
    }
}