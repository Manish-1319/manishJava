import java.util.*;
public class declare{
    public static void main(String[] args){
        String str1 = "Manish";
        String str2 = new String("Singh");
        String str3 = "Vishal@ 22";  //We can store any letter, digit, character in string
        System.out.println(str3);

        System.out.print("Enter the name: ");
        Scanner sc = new Scanner(System.in);
        String name;
        // name = sc.next();   //It store single word
        name = sc.nextLine();
        System.out.println(name);

        String fullname = "Manish Singh";
        System.out.println("The length of " + fullname + " is " + fullname.length());

        String fName = "Captain";
        String lName = "America";
        String fullName = fName + " " + lName; 
        //"Concatenation" is the process of combining two or more strings to form a new string by subsequently appending the next string to the end of the previous strings. In Java, two strings can be concatenated by using the + or += operator, or through the concat() method, defined in the java.
        System.out.println(fullName);
        System.out.println(fullName.charAt(8));
        
    }
}
