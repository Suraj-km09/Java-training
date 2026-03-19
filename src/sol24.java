// sum of square of even number till n

public class sol24 {
    public static void main(String[] args){
        int n = 5;
        int sum  = 0;

        for( int i=1; i<=n; i++){
            if ( i % 2 == 0){
                sum += i*i;
            }
        }

        System.out.println(" sum of square = "+ sum);

    }
}