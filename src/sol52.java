
public class sol52 {
    public static void main(String[] args) {
        int num = 123456;
        int count = 0;

        while (num > 0) {
            int d = num % 10;
            if (d % 2 == 0) {
                System.out.print(d + " ");
                count++;
            }
            num /= 10;
        }

        System.out.println("\nCount = " + count);
    }
}