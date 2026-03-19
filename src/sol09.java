
public class sol09 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (i == 50) continue;

            System.out.print(i + " ");
            count++;
        }

        System.out.println("\nPrinted count = " + count);
    }
}