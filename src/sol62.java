
public class sol62 {
    public static void main(String[] args) {
        int N = 50;

        for (int i = 1; i <= N; i++) {
            int temp = i;
            boolean found = false;

            while (temp > 0) {
                if (temp % 10 == 5) {
                    found = true;
                    break;
                }
                temp /= 10;
            }

            if (found) System.out.print(i + " ");
        }
    }
}