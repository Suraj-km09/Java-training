
public class sol47 {
    public static void main(String[] args) {
        int num = 12345;
        int last = num % 10;

        int temp = num;
        int first = 0, digits = 0;

        while (temp > 0) {
            first = temp % 10;
            temp /= 10;
            digits++;
        }

        int middle = (num % (int)Math.pow(10, digits - 1)) / 10;
        int result = last * (int)Math.pow(10, digits - 1) + middle * 10 + first;

        System.out.println("Result = " + result);
    }
}