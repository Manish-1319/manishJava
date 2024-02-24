import java.util.*;
public class binToDec {
    public static int binNo(int n) {
        int pow = 0;
        int decNo = 0;
        while(n>0){
            int lastDig = n%10;
            decNo  = decNo + lastDig*(int)Math.pow(2,pow);
            pow++;
            n/=10;
        }
        return decNo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary no. = ");
        int n = sc.nextInt();
        System.out.println("Decimal of " +n+ " = "+binNo(n));
    }
}
