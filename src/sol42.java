
public class sol42 {
    public static void main(String[] args) {
        int num = 9876;
        int steps = 0;

        while (num > 9) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
            steps++;
        }

        System.out.println("Result = " + num);
        System.out.println("Steps = " + steps);
    }
}