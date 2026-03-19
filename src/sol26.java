// sum of cube of number div by 3

public class sol26 {
    public static void main(String[] args){
        int n = 5;
        int sum  = 0;

        for( int i=1; i<=n; i++){
            if ( i % 3 == 0){
                sum += i*i*i;
            }
        }

        System.out.println(" sum of cube div by 3 = "+ sum);

    }
}