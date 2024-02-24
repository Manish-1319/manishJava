import java.util.*;
public class spiralMatrix{
    public static void printSpiral(int[][] matrix){
        int startRow=0, endRow=matrix.length-1, startColumn=0, endColumn=matrix[0].length-1;
        while(startRow<=endRow && startColumn<=endColumn){
            for(int j=startColumn; j<=endColumn; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endColumn]+" ");
            }
            for(int j=endColumn-1; j>=startColumn; j--){
                //if row & cloumn is odd ,then middle element repeat itself so we use this condition
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            for(int i=endRow-1; i>=startRow+1; i--){
                //if row & cloumn is odd ,then middle element repeat itself so we use this condition
                if(startColumn == endColumn){
                    break;
                }
                System.out.print(matrix[i][startColumn]+" ");
            }
            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}, {17,18,19,20}};
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+"  ");
            } 
            System.out.println();
        }
        printSpiral(matrix);
    }
}