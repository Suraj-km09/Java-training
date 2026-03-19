
public class sol67 {
    public static void main(String[] args) {
        int n = 29;
        boolean isPrime = true;

        if (n < 2) isPrime = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}