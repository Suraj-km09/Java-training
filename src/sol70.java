
public class sol70 {
    public static void main(String[] args) {
        int N = 50, count = 0;

        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) count++;
        }

        System.out.println("Prime count = " + count);
    }
}