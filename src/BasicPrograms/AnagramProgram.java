package BasicPrograms;

import java.util.Arrays;
//A word or phrase made by transposing the letters of another word or phrase.
//Example :  The word "secure" is an anagram of "rescue.
public class AnagramProgram {
    public static void isAnagram(String S1,String S2) {
        String S3 = S1.replaceAll("\\s","");
        String s4 = S2.replaceAll("\\s","");
        if(S3.length() != s4.length()) {
            System.out.println("Not a Anagram");
            return;
        }
        char[] s3Array = S3.toLowerCase().toCharArray();
        char[] s4Array = s4.toLowerCase().toCharArray();
        Arrays.sort(s3Array);
        Arrays.sort(s4Array);
        boolean status = Arrays.equals(s3Array,s4Array);
        if(status) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not a Anagram");
        }
    }

    public static void main(String[] args)
    {
        isAnagram("Mother In Law", "Hitler Woman");
        isAnagram("keEp", "peeK");
        isAnagram("loop","pool");
    }
}
