// sum of number divisible by 3 till n

public class sol27 {
    public static void main(String[] args){
        int n = 5;
        int sum  = 0;

        for( int i=1; i<=n; i++){
            if ( i % 3 == 0){
                sum += i;
            }
        }

        System.out.println(" sum of square = "+ sum);

    }
}