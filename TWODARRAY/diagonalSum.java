public class diagonalSum {      //possible for n*n matrix
    public static void totalSum(int[][] matrix){
        int sum = 0;
                        //FIRST METHOD
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         //for primary diagonal (value of i=j)
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         //for secondary diagonal (value of i+j = constant)
        //         else if(i+j == matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     } 
        // }
                        //SECOND METHOD(OPTIMIZED)
        for(int i=0; i<matrix.length; i++){
            //for primary diagonal (i=j)
            sum += matrix[i][i];

            //for secondary diagonal (i+j=matrix.length-1  =>  j==matrix.length-1-i)
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("The total sum of diagonal elements = " + sum);
    }

    public static void main(String[] args){
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+"  ");
            } 
            System.out.println();
        }
        totalSum(matrix);
    }
}
