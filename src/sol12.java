//Sum using loop vs formula
public class sol12 {
    public static void main(String[] args) {
        int N = 10;

        int sumLoop = 0;
        for (int i = 1; i <= N; i++) {
            sumLoop += i;
        }

        int sumFormula = N * (N + 1) / 2;

        System.out.println("Loop Sum = " + sumLoop);
        System.out.println("Formula Sum = " + sumFormula);
    }
}