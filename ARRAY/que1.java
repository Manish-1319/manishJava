public class que1 {
    public static boolean duplicate(int[] nums, int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,6,9,4,8,3};
        int n = nums.length;
        System.out.println(duplicate(nums, n));
    }
}
