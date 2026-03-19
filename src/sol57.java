
public class sol57 {
    public static void main(String[] args) {
        int N = 50, count = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 7 == 0) count++;
        }

        System.out.println("Count = " + count);
    }
}