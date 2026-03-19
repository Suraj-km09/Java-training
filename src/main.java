
public class main {
    public static void main(String[] args) {
        int N = 20;

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) continue;
            System.out.print(i + " ");
        }
    }
}