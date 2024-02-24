public class que1 {
                            //QUESTION-1
    // public static void main(String[] args){
    //     int[][] array = {{4,7,8}, {8,8,7}};
    //     int num = 0;
    //     for(int i=0; i<array.length; i++){
    //         for(int j=0; j<array[0].length; j++){
    //             if(array[i][j]==7){
    //                 num++;
    //             }
    //         }
    //     }
    //     System.out.println("The total number of 7's are = "+ num);
    // }

                            //QUESTION-2
    // public static void main(String[] args){
    //     int[][] nums = {{1,4,9}, {11,4,3}, {2,2,3}};
    //     int sum = 0;
    //     for(int j=0; j<nums[0].length; j++){
    //         sum+=nums[1][j];
    //     }
    //     System.out.println("The total sum is = "+ sum);
    // }

                            //QUESTION-3
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                transpose[j][i] = matrix[i][j];
            } 
        }

        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
