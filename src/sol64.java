
public class sol64 {
    public static void main(String[] args) {
        int N = 100, sum = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("\nSum = " + sum);
    }
}