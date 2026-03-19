
public class sol54 {
    public static void main(String[] args) {
        int num = 123456;
        int count = 0, sum = 0;

        while (num > 0) {
            int d = num % 10;
            if (d % 2 != 0) {
                count++;
                sum += d;
            }
            num /= 10;
        }

        System.out.println("Count = " + count);
        System.out.println("Sum = " + sum);
    }
}