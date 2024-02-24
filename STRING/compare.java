public class compare {
    public static void main(String[] args){
        String s1 = "Manish";   //We create string in memory as s1 which has value 'Manish'
           
        String s2 = "Manish";   /*If we create string 's2' with same value 'Manish' without using 'new' keyword,  
                                it points the same old string 'Manish at 's1'*/
         
        String s3 = new String("Manish");   //It creates new string 'Manish' in memory at 's3'
           
        
        if(s1 == s2){   // '==' operator compare at 'object' level, so location of s1 and s2 is same.   
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        
        if(s1 == s3){   // '==' operator compare at object level, so it does not campare value stored at s1 and s3.
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }


        if(s1.equals(s3)){  //if we want to check the 'value' stored in string s1 and s3, we use 'equals()'
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

    }
}
