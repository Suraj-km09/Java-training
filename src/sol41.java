
public class sol41 {
    public static void main(String[] args) {
        int num = 9876;

        while (num > 9) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        System.out.println("Single Digit = " + num);
    }
}