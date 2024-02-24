import java.util.Scanner;
public class selectionSort {
    public static void sortBySelection(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sortBySelection(arr);

        //for loop
//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

        //enhanced for loop
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
