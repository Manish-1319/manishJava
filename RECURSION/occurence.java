public class occurence {
    public static int firstocc(int[] arr, int i, int key) {
        if(arr[i] == key) {
            return i;
        }
        return firstocc(arr, i+1, key);
    }

    public static void main(String[] args) {
        int arr[] = {1,4,6,2,3,9,2};
        int key = 2;
        System.out.println(firstocc(arr, 0, key));
    }
}
