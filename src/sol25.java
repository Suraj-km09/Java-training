// sum of cubes of n numbers

public class sol25 {
    public static void main(String[] args){
        int n = 5;
        int sum  = 0;

        for( int i=1; i<=n; i++){
            sum += i*i*i;
        }

        System.out.println(" sum of cube = "+ sum);

    }
}