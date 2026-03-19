// cal factorial and its count

public class sol30 {
    public static void main(String[] args){
        int n = 5;
        int fact  = 1;
        int count = 0;

        for( int i=1; i<=n; i++){
            fact = fact * i;
            count++;

        }
        System.out.println(" factorial of number = "+ fact);
        System.out.println(" count = "+ count);
    }
}