public class stringBuild {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("");   //null string assigned
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);  // This is used to add the character to string
        }
        System.out.println(sb);


        Integer a = 10;
        System.out.println(a.toString());
    }
}
