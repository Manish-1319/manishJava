public class bitOperation {
    // To find the number is even or odd
    public static void oddOrEven(int n){
        // In computer 1 = 000....1, so when we do '&' operation, it compare LSB WITH '1' and other digit with '0' 
        if((n & 1) == 0){   // 1 as a bitmask
            System.out.println("Number is even");       
        }
        else{
            System.out.println("Number is odd");
        }
    }

    // To get the ith bit (i.e. 0 or 1)
    public static int getIthBit(int num, int i){
        int bitMask = 1<<i;
        if((num & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    // To set the ith bit (i.e. 1)
    public static int setIthBit(int num, int i){
        int bitMask = 1<<i;
        return num | bitMask ; 
    }

    // To clear the ith bit (i.e. 0)
    public static int clearIthBit(int num, int i){
        int bitMask = ~(1<<i);
        return num & bitMask ; 
    }

    // To update the ith bit (i.e. newBit is either 0 or 1)
    public static int updateIthBit(int num, int i, int newBit){
            // 1-METHOD
        // if(newBit == 0){
        //     return clearIthBit(num, i);
        // }
        // else{
        //     return setIthBit(num, i);
        // }

            //2-METHOD
        num = clearIthBit(num, i);
        int bitMask = newBit<<i;
        return num | bitMask;
    }

    // To clear last i bits
    public static int clearLastIBits(int num, int i){
        int bitMask = ~(0)<<i;
        return num & bitMask;
    }

    // To clear bits in the given range(between i and j)
    public static int clearBitsInRange(int num, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return num & bitMask;
    }

    // To check if a number is power of 2 or not(1,2,4,8,16,......)
    public static boolean isPowerOfTwo(int num){
        return (num&(num-1)) == 0;
    }

    // To count the number of set bits(i.e.how many times '1' comes in a number)
    public static int countSetBits(int num){
        int count=0;
        while(num>0){
            if((num&1)!=0){     // check LSB of number(i.e. 0 or 1)
                count++;
            }
            num = num>>1;
        }
        return count;
    }

    public static void main(String[] args){
        //  ALL OPERATIONS ARE DONE FOR BINARY NUMBER(EITHER WE GIVE BINARY OR DECIMAL NUMBER)

        // oddOrEven(010101);   // Give binary or decimal number
        // System.out.println(getIthBit(10101,2));   // Give binary or decimal number
        // System.out.println(setIthBit(7,3));   // Give decimal number
        // System.out.println(clearIthBit(10,1));   // Give decimal number 
        // System.out.println(updateIthBit(10,1, 0));
        // System.out.println(updateIthBit(10,2, 1));
        // System.out.println(clearLastIBits(15, 3));
        // System.out.println(clearBitsInRange(31, 1, 3));
        // System.out.println(isPowerOfTwo(18));
        System.out.println(countSetBits(15));
    }  
}
