import java.util.*;
public class pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.= ");
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1; j++){
                if(i==1 || i==2*n-1 || j==1 || j==2*n-1){
                    System.out.print(n+" ");
                }
                else if(i==j && (i+j)==2*n)
                    System.out.print(n-2+" ");
                
                else
                    System.out.print(n-1+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
