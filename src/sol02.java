
public class sol02 {
    public static void main(String[] args) {
        int N = 20;

        for (int i = N; i >= 1; i--) {
            if (i % 7 == 0) break;
            System.out.print(i + " ");
        }
    }
}