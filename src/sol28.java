// sum of number divisible by 3 till n and count

public class sol28 {
    public static void main(String[] args){
        int n = 6;
        int sum  = 0;
        int count  = 0;

        for( int i=1; i<=n; i++){
            if ( i % 3 == 0){
                sum += i;
                count++;
            }
        }

        System.out.println(" sum of number = "+ sum);
        System.out.println(" count = "+ count);

    }
}