package StringPractice;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {

    public static void main(String[] args) {
        duplicateCharCount("Thirumalmani Nandhini");
    }

    static void duplicateCharCount(String inputString) {
        HashMap<Character,Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArr =  inputString.toCharArray();
        for(char c: strArr) {
            if(charCountMap.containsKey(c)) {
                charCountMap.put(c,charCountMap.get(c)+1);
            } else {
                charCountMap.put(c,1);
            }
        }
        Set<Character> charInString= charCountMap.keySet();
        for(Character ch :charInString) {
            if(charCountMap.get(ch) > 1)
            {
                //If any char has a count of more than 1, printing it's count
                System.out.println(ch +" : "+ charCountMap.get(ch));
            }
        }
    }
}
