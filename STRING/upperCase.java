public class upperCase {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0)); //the first character convert to uppercase
        sb.append(ch);  //the first character stored to sb

        for(int i=1; i<str.length(); i++){  //we iterate from i=1 bcz the first character already stored in 'sb'
            if(str.charAt(i) ==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();   //.toString() converts StringBuilder to string, without this code will give error
    }

    public static void main(String[] args){
        String str = "the first character of every word is converted to uppercase.";
        System.out.println(toUpperCase(str));
    }
}
