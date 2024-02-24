import java.util.*;
public class switchh{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int a = sc.nextInt();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter second no: ");
        int b = sc.nextInt();
        
        switch(operator){
            case '+' : System.out.println("Your result is: "+ a+b);
                break;
            case '-' : System.out.println("Your result is: "+ (a-b));
                break;
            case '*' : System.out.println("Your result is: "+ a*b);
                break;
            case '/' : System.out.println("Your result is: "+ a/b);
                break;
            case '%' : System.out.println("Your result is: "+ a%b);
                break;
            case '^' : {
                int power = 1;
                for(int i=1; i<=b; i++)
                    power = power*a;
                System.out.println("Your result is: "+ power);
            }
                break;
            default : System.out.println("Wrong Operator");
        }
        sc.close();
    }
}