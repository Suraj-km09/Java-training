
public class sol66 {
    public static void main(String[] args) {
        int num = 112233444;
        int[] freq = new int[10];

        while (num > 0) {
            freq[num % 10]++;
            num /= 10;
        }

        int maxDigit = 0, maxFreq = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxDigit = i;
            }
        }

        System.out.println("Digit = " + maxDigit);
        System.out.println("Frequency = " + maxFreq);
    }
}