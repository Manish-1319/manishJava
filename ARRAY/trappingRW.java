                            // IMPORTANT //
/* Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining. */

public class trappingRW{

    public static int trapping(int height[], int n){
        int max = 0;
        // calculate left maximum boundry
        int[] lmax = new int[n];
        for(int i=0; i<n; i++){
            max = Math.max(max, height[i]);
            lmax[i] = max;
        }
        // calculate right maximum boundry
        int[] rmax = new int[n];
        max = 0;
        for(int i=n-1; i>=0; i--){
            max = Math.max(max, height[i]);
            rmax[i] = max;
        }
        // calculate total water
        int totalTrappedWater = 0;
            for(int i=0; i<n; i++){
                int lb = lmax[i];
                int rb = rmax[i];
                int waterLevel = Math.min(lb ,rb);
                int currWater = waterLevel - height[i]; //since width=1, so we will not multiply by it.
                totalTrappedWater += currWater;
        }
        return totalTrappedWater;
    }
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};
        int n = height.length ;
        System.out.println( "Total trapped water = " + trapping(height, n));
    }
}
