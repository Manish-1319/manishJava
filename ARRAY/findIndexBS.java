import java.util.*;
public class findIndexBS {
    //Find the index of element in given array by using binary search.
    public static int search(int number[], int key){
        int start = 0, end = number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            else if(number[mid]<key){
                start =mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.print("Enter the key : ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int number[] = {2,4,6,8,10,12,14,16};
        System.out.println("Key found at index :"+ search(number, key));
    }   
}
