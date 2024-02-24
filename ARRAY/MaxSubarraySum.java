public class MaxSubarraySum {
                                // METHOD-1 BRUTE FORCE
    // public static void main(String[] args){
    //     int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
    //     int maxSum = Integer.MIN_VALUE;    //This is used for "-infinity" 
    //     int minSum = Integer.MAX_VALUE;    //This is used for "+infinity"
    //     for(int i=0; i<numbers.length; i++){
    //         for(int j=i; j<numbers.length; j++){
    //             int currSum=0;  //sum of subarrays
    //             for(int k=i; k<=j; k++){
    //                 System.out.print(numbers[k]+" ");
    //                 currSum+=numbers[k];

    //                 if(currSum>maxSum){
    //                     maxSum = currSum;
    //                 }

    //                 if(currSum<minSum){
    //                     minSum = currSum;
    //                 }
    //             }
    //             System.out.println();
    //             System.out.println("Sum of this subarray = " + currSum);     //To print sum of subarrays
    //             System.out.println();
    //         }
    //     }
    //     System.out.println("Maximum sum of subarray = "+maxSum);
    //     System.out.println("Minimum sum of subarray = "+minSum);
    // }


                                //METHOD-2 PREFIX SUM
    // public static void main(String[] args){
    //     int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
    //     int maxSum = Integer.MIN_VALUE;
    //     int minSum = Integer.MAX_VALUE;
    //     int currSum = 0;
    //     int prefix[] = new int[numbers.length];
    //     prefix[0] = numbers[0];
       
    //     //calculate prefix array
    //     for(int i=1; i<prefix.length; i++){
    //         prefix[i] = prefix[i-1] + numbers[i];
    //     }

    //     for(int i=1; i<numbers.length; i++){
    //         int start = i;
    //         for(int j=i; j<numbers.length; j++){
    //             int end = j;
    //             currSum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                
    //             if(currSum>maxSum)
    //                 maxSum = currSum;
    //             if(currSum<minSum)
    //                 minSum = currSum;
    //         }
    //     }
    //     System.out.println("Maximum sum of subarray = "+maxSum);
    //     System.out.println("Minimum sum of subarray = "+minSum);
    // }


                                //METHOD-3 C
                            // KADANE'S ALGORITHM
    public static void main(String[] args){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            currSum += numbers[i];
            maxSum = Math.max(maxSum,currSum);
            
            if(currSum<0){
                currSum = 0;
            }
        }
        System.out.println("Maximum sum of subarray = "+maxSum);
    }
}