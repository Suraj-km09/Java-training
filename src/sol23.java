//sum of square of first N numbers

public class sol23 {
    public static void main(String[] args){
        int n = 5;
        int sum  = 0;

        for( int i=1; i<=n; i++){
            sum += i*i;


        }

        System.out.println(" sum of square = "+ sum);

    }
}