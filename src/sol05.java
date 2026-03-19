
public class sol05 {
    public static void main(String[] args) {
        int num = 5;
        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
            System.out.println(num + " x " + i + " = " + table[i - 1]);
        }
    }
}