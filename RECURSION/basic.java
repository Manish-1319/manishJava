public class basic {
    public static void printDec(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        printDec(n-1);
    }

    public static void printInc(int n) {
        if(n==10) {
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        printInc(n+1);
    }
    public static void main(String[] arg) {
        printDec(10);
        printInc(1);
    }
}
