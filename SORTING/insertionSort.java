import java.util.*;
public class insertionSort {
    public static void  sortByInsertion(int[] arr){
//        for(int i=1; i<arr.length; i++){
//            int curr = i;
//            for(int j=i-1; j>=0; j--){
//                if(arr[curr]<arr[j]){
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[curr];
//                    arr[curr] = temp;
//                    curr--;
//                }
//            }
//        }
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct pos to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sortByInsertion(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
