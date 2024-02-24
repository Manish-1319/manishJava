public class factorial {
    public static int printFact(int n) {
        if(n==0) {
            return 1;
        }
        int result = n*printFact(n-1);
        return result;
    }
    public static void main(String[] arg) {
        System.out.println(printFact(7));;
    }
}
