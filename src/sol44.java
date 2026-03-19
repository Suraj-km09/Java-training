
public class sol44 {
    public static void main(String[] args) {
        int N = 500;

        for (int i = 1; i <= N; i++) {
            int num = i, sum = 0;

            while (num > 0) {
                int d = num % 10;
                sum += d * d * d;
                num /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}