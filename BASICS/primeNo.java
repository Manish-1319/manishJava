import java.util.*;
public class primeNo {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no.= ");
    int n = sc.nextInt();
    if(n==2){
        System.out.println("No is prime");
    }
    else{
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0)
                isPrime = false;
        }
        if(isPrime == true)
            System.out.println("No is prime");
        else
            System.out.println("No is not prime");
    }
    sc.close();
    }    
}    
