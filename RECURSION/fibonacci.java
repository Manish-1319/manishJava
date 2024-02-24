public class fibonacci {
    public static int printNum(int n) {
        if(n==0) {
            return 0;
        }
        else if(n==1) {
            return 1;
        }
        else{
            return printNum(n-2) + printNum(n-1);
        }
    }
    public static void main(String[] arg) {
        for(int i=0; i<10; i++) {
            System.out.print(printNum(i)+ " ");
        }
        
    }
}
