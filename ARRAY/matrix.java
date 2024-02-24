import java.util.*;
public class matrix{
    public static boolean search(int[][] matrix, int key){
        for(int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.println("Key found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void minMax(int[][] matrix){
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                minNum = Math.min(minNum, matrix[i][j]);
                maxNum = Math.max(maxNum, matrix[i][j]);
            }
        }
        System.out.println("Minimum number is = " + minNum);
        System.out.println("Maximum number is = " + maxNum);
    }

    public static void main(String[] args){
        System.out.println("Enter the size of row and column: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for(int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print( matrix[i][j]+" ");;
            }
            System.out.println();
        }
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        search(matrix, key);
        minMax(matrix);
    }
}


