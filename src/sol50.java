public class sol50 {
    public static void main(String[] args) {
        int num = 10020;
        int count = 0;

        while (num > 0) {
            if (num % 10 == 0) {
                count++;
            }
            num /= 10;
        }

        System.out.println("Zero count = " + count);
    }
}