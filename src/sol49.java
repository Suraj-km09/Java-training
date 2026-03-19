
public class sol49 {
    public static void main(String[] args) {
        int num = 10234;
        boolean found = false;

        while (num > 0) {
            if (num % 10 == 0) {
                found = true;
                break;
            }
            num /= 10;
        }

        if (found) {
            System.out.println("Contains 0");
        } else {
            System.out.println("No 0");
        }
    }
}