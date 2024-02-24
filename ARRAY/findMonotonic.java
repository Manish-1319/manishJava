public class findMonotonic {
    public static boolean isIncreasing(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            if(arr[i]> arr[i+1])    //next element should not be smaller
                return false;
        }
        return true;
    }
    public static boolean isDecreasing(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            if(arr[i]< arr[i+1])  //next element should not be greater
                return false;
        }
        return true;
    }

    public static boolean isMonotonic(int[] arr, int n){
        boolean Increasing = isIncreasing(arr, n);
        boolean Decreasing = isDecreasing(arr, n);

        return Increasing || Decreasing;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        System.out.println("Is the given array monotonic : " + isMonotonic(arr, n));
    }
}
