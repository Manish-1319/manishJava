public class largestNo {
    //Find the largest number in given array.
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;    //This is used for "-infinity", value of Integer.MIN_VALUE = -2147483648
        for(int i=0; i<number.length; i++){
            if(number[i]>largest){
                largest = number[i];
            }
        }
        return largest;
    }

    //Find the smallest number in given array.
    public static int getSmallest(int number[]){
        int smallest = Integer.MAX_VALUE;    //This is used for "+infinity", value of Integer.MAX_VALUE = 2147483647
        for(int i=0; i<number.length; i++){
            if(number[i]<smallest){
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        int number[] = {3,4,6,9,2,5,7,1};
        System.out.println("The largest no is : "+ getLargest(number));
        System.out.println("The smallest no is : "+ getSmallest(number));
    }
}
