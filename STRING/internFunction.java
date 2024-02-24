public class internFunction {
    public static void main(String[] args){
        String s1 = new String("Welcome to JavaTpoint.");   
        String s2 = new String("Welcome to JavaTpoint");  
        System.out.println(s1 == s2);   // prints false

        // String s1 = new String("Welcome to JavaTpoint").intern();
        // String s2 = new String("Welcome to JavaTpoint").intern(); 
        // System.out.println(s1 == s2);    // prints true  

        // String s1=new String("hello");  
        // String s2="hello";  
        // String s3=s1.intern();     //returns string from pool, now it will be same as s2  
        // System.out.println(s1==s2);    //false because reference variables are pointing to different instance  
        // System.out.println(s2==s3);    //true because reference variables are pointing to same instance  

        // String s1 = "Javatpoint";  
        // String s2 = s1.intern();  
        // String s3 = new String("Javatpoint");  
        // String s4 = s3.intern();          
        // System.out.println(s1==s2); // True  
        // System.out.println(s1==s3); // False  
        // System.out.println(s1==s4); // True       
        // System.out.println(s2==s3); // False  
        // System.out.println(s2==s4); // True        
        // System.out.println(s3==s4); // False  

    }
}
