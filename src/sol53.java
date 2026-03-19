
public class sol53 {
    public static void main(String[] args) {
        int num = 123456;
        int count = 0;

        while (num > 0) {
            if ((num % 10) % 2 != 0) count++;
            num /= 10;
        }

        System.out.println("Odd digits = " + count);
    }
}