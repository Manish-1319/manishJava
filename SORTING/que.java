import java.util.*;
public class que{
    public static void sorting(int[] arr){
        //bubble sort
//        for(int i=0; i<arr.length;i++) {
//            for (int j=0; j<arr.length-1-i; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }

        //selection sort
//        int max = Integer.MIN_VALUE;
//        for(int i=0; i<arr.length;i++) {
//            int minPos=i;
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[j]>arr[minPos]) {
//                    minPos=j;
//                }
//            }
//            int temp = arr[minPos];
//            arr[minPos] = arr[i];
//            arr[i] = temp;
//        }

        //insertion sort
        for(int i=1; i<arr.length-1; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && curr>arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args){
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        sorting(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
