public class substring {
    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){   //ending index is excluded
            substr += str.charAt(i);
        }
        return substr;
    }
    
    public static void main(String[] args){
        String str = "HelloWorld";
        System.out.println(str.substring(1, 5));
        System.out.println(subString(str, 4, 7));
    }
}
