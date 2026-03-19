public class sol14 {
    public static void main(String[] args) {
        int N = 10;
        int sum = 0, count = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Count = " + count);
    }
}