import java.util.*;
public class declare {
    public static boolean findKey(int[][] matrix, int key){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at index ("+i+","+j+")");
                    return true;
                }
            } 
        }
        System.out.println("Key not found.");
        return false;
    }
    public static void main(String[] args){
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println("Enter the elements of 2D array:");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            } 
        }

        //print matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            } 
            System.out.println();
        }

        System.out.print("Enter the key:");
        int key = sc.nextInt();
        findKey(matrix, key);

        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        for(int i=0; i<matrix.length; i++){     
            // for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][i]+" ");
            // } 
            System.out.println();
        }
    }
}
