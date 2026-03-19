// avg of sum divisible by 3 from 1 to n

public class sol22 {
    public static void main(String[] args){
        int n = 21;
        int sum  = 0;
        int count = 0;

        for( int i=1; i<=n; i++){
            if ( i % 3 == 0){
                sum += i;
                count++;
            }
        }
        double avg = (double) sum /count;
        System.out.println(" average = "+ avg);

    }
}

