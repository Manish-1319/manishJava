                    //Search in Sorted Matrix
import java.util.*;
public class searchInSM {
    public static boolean linearSearch(int[][] matrix, int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(key==matrix[i][j]){
                    System.out.println("Key found at index: ("+i+","+j+")");
                    return true;
                }
            } 
        }
        System.out.println("Key not found");
        return false;
    }

    public static boolean binarySearch(int[][] matrix, int key){
        return true;
    }

    public static boolean stairCaseSearch(int[][] matrix, int key){
                    //APPROACH-1//
        // int rows = 0, cols = matrix[0].length-1;
        // while (rows<matrix.length && cols>=0) {
        //     if(key==matrix[rows][cols]){
        //         System.out.println("Key found at index (" +rows+ "," +cols+ ")");
        //         return true;
        //     }
        //     else if(key<matrix[rows][cols]){
        //         cols--;
        //     }
        //     else{
        //         rows++;
        //     }
        // }
        // System.out.println("Key not found");
        // return false;
                    //APPROACH-2//
        int rows = matrix.length-1, cols = 0;
        while (rows>=0 && cols<matrix[0].length) {
            if(key==matrix[rows][cols]){
                System.out.println("Key found at index (" +rows+ "," +cols+ ")");
                return true;
            }
            else if(key<matrix[rows][cols]){
                rows--;
            }
            else{
                cols++;
            }
        }
        System.out.println("Key not found");
        return false;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {{10,20,30,40}, {15,25,35,45}, {27,29,37,48}, {32,33,39,50}};
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+"  ");
            } 
            System.out.println();
        }
        System.out.print("Enter the key = ");
        int key = sc.nextInt();

        // linearSearch(matrix,key);
        stairCaseSearch(matrix,key);
    }
}
