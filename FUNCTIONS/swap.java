public class swap{
                        //Method 1
    // public static void main(String[] args){
    //     int a=10;
    //     int b=20;
    //     int temp=a;
    //     a=b;
    //     b=temp;
    //     System.out.println("a = "+a);
    //     System.out.println("b = "+b);
        
    // }


                        //Method 2
    // public static void swap(int a, int b){
    //     int temp = a;    
    //     a=b;
    //     b=temp;    
    //     System.out.println("a = "+a);
    //     System.out.println("b = "+b);
    //     }
    // public static void main(String[] args){
    //     int a=10;
    //     int b=20;
    //     swap(a, b);
    // }

                        //Method 3
    public static void swap(int a, int b){
        a = a+b-(b=a);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        }
    public static void main(String[] args){
        int a=10;
        int b=20;
        swap(a, b);
    }                        
}