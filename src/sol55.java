
public class sol55 {
    public static void main(String[] args) {
        int num = 1223342;
        int target = 2;
        int count = 0;

        while (num > 0) {
            if (num % 10 == target) count++;
            num /= 10;
        }

        System.out.println("Occurrences = " + count);
    }
}