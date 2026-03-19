
public class sol04 {
    public static void main(String[] args) {
        int N = 20;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }

        System.out.println("\nSum = " + sum);
    }
}