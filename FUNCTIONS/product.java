public class product {
    //Method 1

    // public static void multiply(int a, int b){
    //     int product = a*b;
    //     System.out.println(product);
    // }
    // public static void main(String[] args){
    //     int a = 3;
    //     int b = 5;
    //     multiply(a, b);
    // }    


    //Method 2

    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        int ans = multiply(a, b); 
        System.out.println(ans);
    }
}