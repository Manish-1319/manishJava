public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,6,9,5,3,8};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int swap = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap=swap+1;
                }
            }
            if(swap==0){
                System.out.println("Array is already sorted.");
                break;
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}