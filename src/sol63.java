
public class sol63 {
    public static void main(String[] args) {
        int N = 100, count = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) count++;
        }

        System.out.println("Count = " + count);
    }
}