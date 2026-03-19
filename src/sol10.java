
public class sol10 {
    public static void main(String[] args) {
        int N = 10;
        int[] arr = new int[N];

        int index = 0;

        for (int i = N; i >= 1; i--) {
            arr[index++] = i;
            System.out.print(i + " ");
        }
    }
}