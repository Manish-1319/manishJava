public class bitwiseBasic {
    public static void main(String[] args){
        //Binary AND
        System.out.println(5&6);
        //Binary OR
        System.out.println(5|6);
        //Binary XOR
        System.out.println(5^6);
        //Binary NOT (ONE'S COMPLEMENT)
        // ~00000000 00000000 00000000 00000101 = 11111111 11111111 11111111 11111010
        // will give 2's complement (32 bit) of 5 = -6
        System.out.println(~5);
        //Binary LEFT SHIFT OPERATOR
        System.out.println(5<<2);
        //Binary LEFT SHIFT OPERATOR
        System.out.println(6>>1);
    }
}