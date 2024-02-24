import java.util.*;
public class binomial {
    public static int factorial(int n){
        int fact = 1;
        if(n==0 || n==1){
            fact = 1;
        }
        else{
            for(int i=1; i<=n; i++)
                fact=fact*i;
        }
        return fact;
    }

    public static void binomial(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoeff = fact_n/(fact_r * fact_nmr);
        System.out.println("Binomial Cofficient is = "+binCoeff);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        System.out.print("Enter r = ");
        int r = sc.nextInt();
        binomial(n, r);
    }
}
