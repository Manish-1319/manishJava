public class subarrays {
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10};
        int tsa=0;   //tsa=total subarray
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k]+" ");
                }
                tsa++;
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("Total subarrays = "+ tsa);  
    }
}