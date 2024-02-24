public class replace {
    public static void main(String[] args){
        String str1 = "Manish Singh Manish Singh".replace('M', 'V');
        System.out.println(str1);

        String str2 = "Manish Singh Manish Singh".replace("Manish", "Vishal");       
        System.out.println(str2);

        String str3 = "Manish Singh Manish Singh".replaceAll("Manish", "Vishal");    
        System.out.println(str3);

        String str4 = "Manish Singh Manish Singh".replaceFirst("Manish", "Vishal");     
        System.out.println(str4);
 
    }
}
