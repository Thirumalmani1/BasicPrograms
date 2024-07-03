package BasicPrograms;

import java.util.Scanner;
//Write a program that will take one string as input. The program will then remove vowels a, e, i, o, and u (in lower or upper case ) from the string.
// If there are two or more vowels that occur together then the program shall ignore all of those vowels.
public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String result = removeVowels(input);
        System.out.println(result);
    }

    public static String removeVowels(String input) {
            char[] charArray = input.toCharArray();
            StringBuffer resultString = new StringBuffer();
            for(char c : charArray) {
                if(!isVowels(c)) {
                    resultString.append(c);
                }
            }
            return resultString.toString();
    }

    public static boolean isVowels(char c) {
        char lowercase = Character.toLowerCase(c);
        return lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == '0' || lowercase == 'u';
    }
}
