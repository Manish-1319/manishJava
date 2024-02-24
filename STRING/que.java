import java.util.Arrays;
import java.util.Scanner;
public class que {
                    // QUE-1
    // public static void main(String[] args) {
    //     System.out.print("Enter the string: ");
    //     String str = new Scanner(System.in).nextLine();
    //         int count = 0;
    //         for(int i=0; i<str.length(); i++) {
    //             char ch = str.charAt(i);
    //             if(ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' ||ch == 'u') {
    //             count++;
    //         }
    //     }
    //     System.out.println("count of vowels is :" + count);
    // }
    

                    // QUE-2
    // public static void main(String args[]) {
    //     String str = "ShradhaDidi";
    //     String str1 = "ApnaCollege";
    //     String str2 = "ShradhaDidi";
    //     System.out.println(str.equals(str1) + " " + str.equals(str2));
    // }               
    
                    // QUE-3
    // public static void main(String args[]) {
    //     String str="ApnaCollege".replace("l","");
    //     System.out.println(str);
    // }

                    //QUE-4
    //ANAGRAMS: A word, phrase, or name formed by rearranging the letters of another, such as "cinema", formed from "iceman".
                // Example: "Secure" & "Rescue" , "heart" & "earth" (LOWERCASE AND UPPERCASE ARE SAME)             
    public static void main(String[] args){
        System.out.print("Enter fisrt string: ");
        String str1 = new Scanner(System.in).nextLine();
        System.out.print("Enter second string: ");
        String str2 = new Scanner(System.in).nextLine();

        // First check - if the lengths are the same
        if(str1.length() == str2.length()){

            //Convert strings to lowercase. Why? So that we don't have to check separately for lower & upper case.
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // convert strings into char array
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            // sort the char array
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            // if the sorted char arrays are same or identical then the strings are anagram
            boolean result = Arrays.equals(str1CharArray, str2CharArray);

            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            }
            else{
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        }
        else{
            System.out.println("Length are not same. So " + str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }

}