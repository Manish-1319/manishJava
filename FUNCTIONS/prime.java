import java.util.*;
public class prime {
    public static boolean isPrime(int n){
        if(n==2)    //corner case
        return true;
        else{
            // for(int i=2; i<=n-1; i++){

            for(int i=2; i<=Math.sqrt(n); i++){
                /*we use square root of n for optimization because all the factor of n are
                covered before root(n) without repetition.*/
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. = ");
        int n = sc.nextInt();
        System.out.println("Is the no. prime? "+ isPrime(n));

    }
}