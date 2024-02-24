/* You are given an integer array nums. Returns all lonely numbers in nums.
A number x is lonely when it appears only once, and no adjacent numbers(i.e. x-1 & x+1) apppear in the array. */
import java.util.Arrays;
public class lonelyNo {
    public static void printLonelyNo(int nums[], int n){
        Arrays.sort(nums);

        // for(int i=0; i<n; i++){
        //     if(i==0){
        //         if(nums[i]+1 != nums[i+1])
        //             System.out.print(nums[i] +" ");
        //     }
        //     else if(i==n-1){
        //         if(nums[i-1]+1 != nums[i])
        //             System.out.print(nums[i] +" ");
        //     }
        //     else{
        //         if(nums[i-1]+1 != nums[i] && nums[i]+1 != nums[i+1])
        //             System.out.print(nums[i] +" ");
        //     }
        // }

        for(int i=0; i<n; i++){
            if(i==0){
                if(nums[i+1]-nums[i] > 1)
                    System.out.print(nums[i] +" ");
            }
            else if(i==n-1){
                if(nums[i]-nums[i-1] > 1)
                    System.out.print(nums[i] +" ");
            }
            else{
                if(nums[i]-nums[i-1] > 1  && nums[i+1]-nums[i] > 1)
                    System.out.print(nums[i] +" ");
            }
        }
    }
    public static void main(String[] args){
        int nums[]  = {1,8,10,2,5,7};
        int n = nums.length;
        printLonelyNo(nums, n);
    }
}
