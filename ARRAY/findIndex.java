import java.util.*;
public class findIndex {
    //Find the index of element in given array by using linear search.
    public static void main(String[] args){
        System.out.print("Enter the key : ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int number[] = {2,4,6,8,10,12,14,16};
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                System.out.println("Index is : "+i);
            }
        }
    }
}
