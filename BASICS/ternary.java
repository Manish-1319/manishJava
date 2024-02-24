import java.util.*;
public class ternary{
    public static void main(String[] args) {
        System.out.print("Enter your no. ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String type = ((num%2) == 0) ? "even" : "odd";
        System.out.println(type);
           
        // String reportCard = (num>33)?"PASS":"FAIL";
        // System.out.println(reportCard);
        
        sc.close(); //to remove warning of sc
    }
}

