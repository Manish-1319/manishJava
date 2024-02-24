public class largestString {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "ABC";
        System.out.println(s1.compareTo(s2));   
        System.out.println(s1.compareToIgnoreCase(s2));

        String fruits[] = {"apple", "mango", "banana"};
        System.out.println(fruits[0].compareTo(fruits[1]));

        String largest = fruits[0];     //Let apple is largest
        for(int i=1; i<fruits.length; i++){     //fruits is 'array' of string so we does not use length() function
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    
}
