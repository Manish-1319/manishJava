import java.util.Arrays;    // package for sorting array in ascending order
import java.util.Collections;   //package for sorting array in reverse order
public class inbuiltSort {
    public static void main(String[] args){
//        int[] arr = {5,4,1,3,2};

        //for sorting an array
//        Arrays.sort(arr);

        //for sorting an array b/w indices
//        Arrays.sort(arr, 0, 3);     //index 3 is not included

        // reverseOrder() function is not working on int(primitive data types)
        Integer[] arr = {5,4,1,3,2};

        //for sorting an array in reverse order
//        Arrays.sort(arr, Collections.reverseOrder());

        //for sorting an array  b/w indices in reverse order
        Arrays.sort(arr, 0, 4, Collections.reverseOrder());

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

