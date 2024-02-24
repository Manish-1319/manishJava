import java.util.*;
public class factorial {
    //Method 1

    // public static void main(String[] args){
    //     System.out.print("Enter the no. = ");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int fact = 1;
    //     if(n==0 || n==1){    //corner cases
    //         System.out.print("The factorial is : 1");
    //     }
    //     else{
    //         for(int i=1; i<=n; i++){
    //             fact=fact*i;
    //         }
    //         System.out.print("The factorial is : "+fact);
    //     }
    // } 
    

    //Method 2
    public static void factorial(int n){
        int fact = 1;
        if(n==0 || n==1){   //corner cases
            System.out.print("The factorial is : 1");
        }
        else{
            for(int i=1; i<=n; i++){
                fact=fact*i;
            }
            System.out.print("The factorial is : "+fact);
        }
    }
    public static void main(String[] args){
        System.out.print("Enter the no. = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
    }
}
