import java.util.Scanner;
public class assignment {
            //QUE-2
    // public static void main(String[] args){
    //     System.out.println("Enter the numbers: ");
    //     Scanner scan = new Scanner(System.in);
    //     int a = scan.nextInt();
    //     int b = scan.nextInt();
    //     System.out.println("Before swapping: a=" +a+ " and b=" +b);
    //     //swap using xor
    //     a = a ^ b;
    //     b = a ^ b;
    //     a = a ^ b;
    //     System.out.println("After swapping: a=" +a+ " and b=" +b);      
    // }

            //QUE-3
    // public static void main(String[] args) {
    //     int x = 6;
    //     System.out.println(x + " + " + 1 + " is " + -~x);
    //     x = -4;
    //     System.out.println(x + " + " + 1 + " is " + -~x);
    //     x = 0;
    //     System.out.println(x + " + " + 1 + " is " + -~x);
    // }

            //QUE-4
    public static void main(String[] args) {
        // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' '));
            // prints abcdefghijklmnopqrstuvwxyz
        }
    }
}