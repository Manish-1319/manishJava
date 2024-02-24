public class exponentiation {
    // Fast Exponentiation (Iterative Function to calculate (x^y) in O(log y))
    public static int fastExp(int x, int y){
        int ans = 1;
        while(y>0){
            if((y & 1) != 0){   //check LSB
                ans = ans*x;
            }
            x = x*x;    // Change x to x^2
            y = y>>1;   // y = y/2
        }
        return ans;
    }

    // Iterative Function to calculate (x^y)%p in O(log y) 
	static int modularExp(int x, int y, int p)
	{
		int ans = 1;
		while (y > 0) {
			if ((y & 1) != 0){
				ans *= x;
            }
			y = y>>1;   
			x = x*x;    
		}
		return ans % p;
	}

    public static void main(String[] args){
        System.out.println(fastExp(3, 5));
        System.out.println(modularExp(3, 5, 8));
    }
}
