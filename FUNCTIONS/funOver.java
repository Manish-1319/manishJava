import java.util.*;
public class funOver {

    //Function overloading using parameters.

    // public static int sum(int a, int b){
    //     return a+b;
    // }

    // public static int sum(int a, int b, int c){
    //     return a+b+c;
    // }

    // public static void main(String[] args) {
    //     System.out.println(sum(3,5));
    //     System.out.println(sum(2,6,3));
    // }


    // Function overloading using data type.
   
    public static int sum(int a, int b){
        return a+b;
    }
    
    public static float sum(float a, float b){
        return a+b;
    }

    // public static float sum(int a, int b){     
    //     return a+b;
    // }
    /*This gives an error of duplicate method because function overloading is not depends on return type.
    There should be either different types of parameter or differnt no. of parameters*/
     public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(2.6f,9.7f));
    }
}
