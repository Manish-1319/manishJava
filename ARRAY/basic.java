import java.util.*;
public class basic {
    public static void main(String[] args) {
        int marks[] = new int[50]; 
        int numbers[] = {1,2,3};
        char vowel[] = {'a', 'b', 'c', 'd', 'e'};
        String fruits[] = {"apple", "mango", "banana"};

        marks[0] = 96;
        marks[1] = 84;
        numbers[0] = 5;  //change the value of index[0] from 1 to 5 

        System.out.println(marks[0]);
        System.out.println(marks[35]);  //It stores 0 at index[35]
        System.out.println(numbers[0]);
        System.out.println(vowel[2]);
        System.out.println(fruits[1]);
        // System.out.println(fruits[6]);  //Index 6 out of bounds for length 3
        System.out.println("Length of marks array = " + marks.length);
        System.out.println("Length of vowel array = " + vowel.length);
    }
}
