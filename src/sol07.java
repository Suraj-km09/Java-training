
public class sol07 {
    public static void main(String[] args) {
        int N = 50;
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 || i % 5 == 0) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}