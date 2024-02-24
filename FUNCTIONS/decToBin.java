import java.util.*;
public class decToBin {
    public static int decNo(int n){
        int pow = 0;
        int binNo = 0;
        while(n>0){
            int rem = n%2;
            binNo = binNo + rem*(int)Math.pow(10,pow);
            pow++;
            n/=2;
        }
        return binNo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal no. = ");
        int n = sc.nextInt();
        System.out.println("Binary of "+ n + " = " + decNo(n));
    }
}