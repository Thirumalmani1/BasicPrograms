package ArrayDuplicates;

import java.util.*;
public class RemoveDuplicateArray {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Thirumal");
        nameList.add("Sriram");
        nameList.add("Naga");
        nameList.add("Thirumal");
        //Constructing HashSet using listWithDuplicateElements
        HashSet<String> dNameList = new HashSet<String>(nameList);
        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(dNameList);
        System.out.println(listWithoutDuplicateElements);
        Iterator<String> stringIterator = dNameList.iterator();
        stringIterator.forEachRemaining(list-> {
            System.out.println(list);
        });
        //Constructing LinkedHashSet using listWithDuplicateElements
        LinkedHashSet<String> linkedNameList = new LinkedHashSet<String>(nameList);
        linkedNameList.forEach(newName -> {
            System.out.println(newName);
        });
     }
}
