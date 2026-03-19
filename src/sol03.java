
public class sol03 {
    public static void main(String[] args) {
        int N = 20;
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nCount = " + count);
    }
}